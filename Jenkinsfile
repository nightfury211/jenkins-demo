pipeline {
    agent any

    tools {
        maven 'Maven-3.9'
    }

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }

    post {
        always {
            echo 'Pipeline finished.'
        }
        success {
            echo 'Build SUCCESS.'
        }
        failure {
            echo 'Build FAILED.'
        }
    }
}