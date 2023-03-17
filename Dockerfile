FROM openjdk:8
EXPOSE 8080
ADD target/testcicd.jar testcicd.jar
ENTRYPOINT ["java","-jar","/testcicd.jar"]