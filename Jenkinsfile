pipeline {
  agent any

   environment {
          env = "${env}"
      }

  stages {
    stage('Running tests') {
      steps {

        catchError(buildResult: 'FAILURE', stageResult: 'FAILURE') {
          sh 'chmod +x gradlew'
          sh './gradlew clean test -PincludeTags="${tags}"'
        }
      }
    }
    stage('Publish Report') {
      steps {
        publishReport()
      }
    }
  }
}

def publishReport() {
  publishHTML(target: [
    reportName: 'Mastercrash E2E API Test Results',
    reportDir: 'target/site/serenity',
    reportFiles: 'index.html',
    keepAll: true,
    alwaysLinkToLastBuild: true,
    allowMissing: false
  ])
}