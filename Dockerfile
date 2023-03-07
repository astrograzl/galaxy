FROM eclipse-temurin:17-jdk-alpine as builder
WORKDIR /alpha
COPY . .
RUN ["./gradlew", "bootJar"]
#ENTRYPOINT ["/bin/sh"]

FROM eclipse-temurin:17-jre-alpine
WORKDIR /alpha
COPY --from=builder /alpha/build/libs/*.jar boot.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "boot.jar"]