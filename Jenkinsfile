pipeline {
    agent any

    stages {
        stage('build gradle') {
            steps {
                sh 'echo hola'
                withGradle {
                    sh './gradlew clean'
                }

                withGradle {
                    sh './gradlew bootJar'
                }
            }
        }
    }
}