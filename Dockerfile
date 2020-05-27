FROM java:8-jdk-alpine
COPY ./target/JenkinsTest-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8080
osascript -e 'tell app "Terminal"
    do script "java -jar JenkinsTest-0.0.1-SNAPSHOT.jar"
end tell'
 