pipeline {
  agent any


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
        publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: 'target/site/serenity', reportFiles: 'index.html', reportName: 'HTML Report', reportTitles: '', useWrapperFileDirectly: true])
      }
    }
  }
}

