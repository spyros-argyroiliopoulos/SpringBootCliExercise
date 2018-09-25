pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        build 'Build'
      }
    }
    stage('Deploy') {
      steps {
        sh 'sh /deploy.sh'
      }
    }
  }
}