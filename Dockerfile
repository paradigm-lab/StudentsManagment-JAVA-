FROM openjdk:17-jdk-slim-buster
ADD /build/libs/mvc-1.0-StudentManagement.jar mvc-1.0-StudentManagement.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "mvc-1.0-StudentManagement.jar"]