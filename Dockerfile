FROM openjdk:8
EXPOSE 8082
ADD target/my-first-demo.jar my-first-demo.jar
ENTRYPOINT ["java","-jar","my-first-demo.jar"]