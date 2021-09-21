FROM adoptopenjdk/openjdk11:alpine-slim
VOLUME /tmp
COPY /build/libs/spring-boot-hello-world-*.jar spring-boot-hello-world.jar
ENTRYPOINT ["java", "-jar", "spring-boot-hello-world.jar"]