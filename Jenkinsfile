pipeline {
  agent any
  options {
    buildDiscarder(logRotator(numToKeepStr: '5'))
  }
//   environment{
//     	DOCKERHUB_CREDENTIALS=credentials('dockerhub')
//   }
  stages {
    stage('Log'){
        steps{
                echo 'holla'
        }
        
    }
    // stage('Login') {
	// 		steps {
	// 			sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
	// 			//sh 'aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin 597647611698.dkr.ecr.us-east-1.amazonaws.com'	
	// 			//sh 'aws ecr-public get-login-password --region us-east-1 | docker login --username AWS --password-stdin public.ecr.aws/yandjoumbi'	    
	// 		}
	// 	}

    // stage('Build & Push') {
	// 		steps {
	// 			sh 'docker build -t yandjoumbi/yann-dj:0.0.1 .'
	// 			sh 'docker build -t yandjoumbi .'
    //             sh 'docker push yandjoumbi/yann-dj:0.0.1'
	// 			//dockerImage = docker.build "yandjoumbi:latest"
	// 		}
	// 	}

    // stage('Scan') {
    //   steps {
    //     withSonarQubeEnv(installationName: 'SonarQube') { 
    //       sh './mvnw clean org.sonarsource.scanner.maven:sonar-maven-plugin:3.9.0.2155:sonar'
    //     }
    //   }
    // }
    // stage('Slack Notification') {
    //   steps {
    //       slackSend channel: 'jenkins-notification', color: 'good', message: 'yannick slack test', teamDomain: 'akloudservices', tokenCredentialId: 'slack'
    //     }
    //   }

    // post {
	// 	always {
	// 		sh 'docker logout'
	// 	}
	// }
  }
}