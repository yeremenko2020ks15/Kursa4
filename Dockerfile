FROM openjdk:11
EXPOSE 8080
ADD target/kursa4.jar springboot-images-new.jar
ENTRYPOINT ["java", "-jar", "/kursa4.jar"]
