pipeline {
    agent any

    stages {
        stage('Pre-build'){
            steps {
                echo '=== PRE-BUILD STARTED ==='

                bat 'java -version'
                bat 'javac -version'

                echo '=== PRE-BUILD ENDED ==='
            }
        }

        stage('Build'){
            steps {
                echo '=== BUILD STARTED ==='

                bat 'if not exist build mkdir build'
                bat 'javac -d build src\\Main.java'

                echo '=== BUILD ENDED ==='
            }
        }

        stage('Test') {
            steps {
                echo '===== TEST STARTED ====='

                bat 'java -cp build Main'

                echo '===== TEST COMPLETED ====='
            }
        }
    }
    post {
        success {
            echo '===== PIPELINE SUCCESS ====='
        }

        failure {
            echo '===== PIPELINE FAILURE ====='
        }
    }
}