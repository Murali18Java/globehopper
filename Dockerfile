FROM openjdk:11
ADD target/globehopperspringdata.jar globehopperspringdata.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "globehopperspringdata.jar"]
