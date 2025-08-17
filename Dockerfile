FROM openjdk:21

COPY target/${project.artifactId}-${project.version}.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app.jar"]