pipeline {
    agent any
    stages {
        stage('checkMavenVersion') {
            steps {
                
                    bat "mvn clean compile"
                }
        }
        stage('testing') {
            steps {
                    bat "mvn test"
                
            }
        }
        stage('deployment') {
            steps {
                    bat "mvn install"
                
            }
        }
    }
}
