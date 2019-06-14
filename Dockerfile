FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD ./build/libs/kotlin-rest-demo-1.0.jar kotlin-rest-demo.jar
ENTRYPOINT ["java", "-jar", "kotlin-rest-demo.jar"]