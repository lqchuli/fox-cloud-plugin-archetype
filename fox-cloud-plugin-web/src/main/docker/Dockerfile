FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD ${parent.artifactId}.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENV SERVER_PORT=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar --server.port=$SERVER_PORT" ]