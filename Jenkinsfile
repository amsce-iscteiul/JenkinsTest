def dockeruser = "menoita99"
def imagename = "helloworld"
def container = "helloworld"
node {
   echo 'Building Apache Docker Image'

stage('Git Checkout') {
    git 'https://github.com/rmsma1-iscteiul/JenkinsTest.git'
    }
    
stage('Build Docker Image'){
     powershell "docker build -t  ${imagename} ."
    }
  
stage ('Runing Container to test built Docker Image'){
    powershell "docker run -dit --name ${container}"
    }
}
