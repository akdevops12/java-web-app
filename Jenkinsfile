pipeline {
  agent any
  options {
    buildDiscarder(logRotator(numToKeepStr: '5'))
  }
  stages {
    stage('Scan') {
      steps {
        withSonarQubeEnv(installationName: 'SonarQube') { 
          sh './mvnw clean org.sonarsource.scanner.maven:sonar-maven-plugin:3.9.0.2155:sonar'
        }
      }
    }
    stage('Slack Notification') {
      steps {
          slackSend channel: 'jenkins-notification', color: 'good', message: 'testing for the color', teamDomain: 'akloudservices', tokenCredentialId: 'slack'
        }
      }
  }
}
