FROM openjdk:8-jdk-alpine
COPY target/encryptdecrypt-service-0.0.1-SNAPSHOT.jar app.jar
RUN mkdir -p /var/log/exported
RUN touch /var/log/exported/test-private.pem
RUN touch /var/log/exported/test-public.pem
VOLUME ["/var/log/exported"]


ENTRYPOINT ["java", "-jar", "/app.jar"]
