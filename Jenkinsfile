pipeline {
  agent any
  stages {
    stage('stage 1') {
      parallel {
        stage('print') {
          steps {
            echo 'Hello world!'
          }
        }
        stage('') {
          steps {
            sh 'echo "i am script"'
          }
        }
      }
    }
  }
}