FROM alpine/git
WORKDIR /app
RUN git clone "https://github.com/rmsma1-iscteiul/JenkinsTest.git"

FROM maven:3.5-jdk-8-alpine
WORKDIR /app
COPY --from=0 /app/JenkinsTest /app 
RUN mvn clean install package

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=1 /app/target/JenkinsTest-0.0.1-SNAPSHOT.jar /app 

