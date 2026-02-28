pipeline {
    agent any

    tools {
        maven 'Maven-3.9'
    }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }

     post {
            always {
                junit 'target/surefire-reports/*.xml'
            }
        }
}
