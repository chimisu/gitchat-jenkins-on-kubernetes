FROM openjdk:8u181-jdk
VOLUME /tmp
COPY target/gitchat-springboot-demo-0.0.1-SNAPSHOT.jar /app/
CMD ["/usr/bin/java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/gitchat-springboot-demo-0.0.1-SNAPSHOT.jar"]

