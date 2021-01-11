FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD ${parent.artifactId}.jar app.jar
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENV SERVER_PORT=""
ENV PROFILE="DEFAULT"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=$PROFILE -jar /app.jar" ]