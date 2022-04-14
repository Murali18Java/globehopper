pipeline {
  environment {
    registry = '540451631109.dkr.ecr.us-east-1.amazonaws.com/jenkins-cicd-new'
    registryCredential = 'aws-ecr-credentials'
    dockerImage = ''
  }
  agent {
        docker {
            image 'maven:3.8.1-adoptopenjdk-11' 
            args '-v /root/.m2:/root/.m2' 
        }
  }
  stages {
      stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
                }
            }
        }
    stage('Building image') {
      steps{
        script {
          dockerImage = docker.build registry + ":latest"
          sh 'echo $dockerImage'
        }
      }
    }
    stage('Push Image to AWS ECR') {
        steps{
            script{
                docker.withRegistry("https://" + registry, "ecr:us-east-1:" + registryCredential) {
                    dockerImage.push()
                }
            }
        }
    }
    
    stage('Deploy docker image to AWS ECS container') {
            steps {
                withAWS(credentials: 'aws-ecr-credentials', region: 'us-east-1') {
                  sh "chmod +x ./jenkins_ecr.sh"
                  sh "./jenkins_ecr.sh"
                }
            }
        }
    }
}
