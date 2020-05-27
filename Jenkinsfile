def dockeruser = "menoita99"
def imagename = "helloworld"
def container = "helloworld"
node {
   echo 'Building Apache Docker Image'

stage('Git Checkout') {
    git 'https://github.com/rmsma1-iscteiul/JenkinsTest.git'
    }
    
stage('Build Docker Image'){
	osascript -e 'tell app "Terminal"
   		do script "docker build -t  ${imagename}"
    	end tell'
    }    
  
stage ('Runing Container to test built Docker Image'){
	osascript -e 'tell app "Terminal"
   		do script "docker run -dit --name ${container}"
    	end tell'

    }
}
