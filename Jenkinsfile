def dockeruser = "menoita99"
def imagename = "helloworld"
def container = "helloworld"
node {
   echo 'Building Apache Docker Image'

stage('Git Checkout') {
    git 'https://github.com/amsce-iscteiul/JenkinsTest.git'
    }
    
stage('Build Docker Image'){
	sh 'docker build -t  ${imagename}'
    	
    }    
  
stage ('Runing Container to test built Docker Image'){
	sh 'docker run -dit --name ${container}'
    	

    }
}
