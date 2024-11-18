FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY build/libs/myapp.jar myapp.jar

ENTRYPOINT ["java", "-jar", "/myapp.jar"]