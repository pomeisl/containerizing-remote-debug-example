# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine
# maintainer
MAINTAINER Ferenc Pomeisl
# copy JAR into image
COPY target/containerizing-remote-debug-example-0.0.1-SNAPSHOT.jar /app.jar
# exposed ports
EXPOSE 8080
# debug port
EXPOSE 5005
# run application with this command line
CMD ["/usr/bin/java", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005", "-jar", "-Dspring.profiles.active=default", "/app.jar"]