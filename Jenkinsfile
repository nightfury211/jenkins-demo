pipeline {
    agent any

    tools {
        maven 'Maven-3.9'
    }

    stages {
        stage('Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}