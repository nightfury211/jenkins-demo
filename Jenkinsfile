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
                bat 'mvn testt'
            }
        }
    }

    post {
        always {
            echo 'Pipeline finished.'
 	    junit 'target/surefire-reports/*.xml'
        }
        success {
            echo 'Build SUCCESS.'
        }
        failure {
            echo 'Build FAILED.'
        }
    }
}