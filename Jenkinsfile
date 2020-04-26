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
                    bat "mvn package"
                
            }
        }
    }
    
    
    post {
        always {
            emailext attachLog: true, body: 'test_mail', recipientProviders: [culprits()], subject: 'This is test', to: 'subhojitroycae@gmail.com'
        }
    }
}
