pipeline {
  agent {
    node {
      label 'test'
    }
    
  }
  stages {
    stage('test') {
      steps {
        sh '''#!/bin/sh

echo "Hello, World!"'''
      }
    }
  }
}