pipeline{

	agent any

	environment {
		DOCKERHUB_CREDENTIALS=credentials('dockerhub-credentials')
	}

	stages {

		stage('Build') {

			steps {
				sh 'docker build -t docker-jenkins-cicd:1.5 .'
			}
		}

		stage('Login') {

			steps {

				sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
			}
		}

		stage('Push') {

			steps {
                sh 'docker tag docker-jenkins-cicd:1.5 $DOCKERHUB_CREDENTIALS_USR/docker-jenkins-cicd:1.5'
				sh 'docker push $DOCKERHUB_CREDENTIALS_USR/docker-jenkins-cicd:1.5'
			}
		}
	}

	post {
		always {
			sh 'docker logout'
		}
	}

}
