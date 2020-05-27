def dockeruser = "menoita99"
def imagename = "openjdk:8-jre-alpine"
def container = "helloworld"
node {
   echo 'Building Apache Docker Image'

stage('Git Checkout') {
    git 'https://github.com/rmsma1-iscteiul/JenkinsTest.git'
    }
    
stage('Build Docker Image'){
     powershell "docker build -t  ${imagename} ."
    }
    
stage('Stop Existing Container'){
     powershell "docker stop ${container}"
    }
    
stage ('Runing Container to test built Docker Image'){
    powershell "docker run -dit --name ${container} -p 80:80 ${imagename}"
    }
    
stage('Tag Docker Image'){
    powershell "docker tag ${imagename} ${env.dockeruser}/ubuntu:16.04"
    }
}
