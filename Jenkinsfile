pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "maven 3.8.3"
    }

    stages {
      stage('Clean'){
      bat "mvn clean"
      }
        stage('Package') {
                    bat "mvn package"

            }
        }
        
    }

