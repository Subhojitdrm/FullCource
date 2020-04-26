pipeline {
    agent any
    stages {
        stage('checkMavenVersion') {
            steps {
                withMaven(maven : 'maven_3_6_3'){
                    sh 'mvn clean compile'
                }
                
            }
        }
        stage('testing') {
            steps {
                withMaven(maven : 'maven_3_6_3'){
                    sh 'mvn test'
                }
                
            }
        }
        stage('deployment') {
            steps {
                withMaven(maven : 'maven_3_6_3'){
                    sh 'mvn install'
                }
                
            }
        }
    }
}
