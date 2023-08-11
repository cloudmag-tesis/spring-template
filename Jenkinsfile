pipeline {
    agent any
    tools {
        gradle '7.6'
    }
    stages {
        stage('build gradle') {
            steps {
                sh 'echo hola'
                withGradle {
                    sh 'gradle clean'
                }
                withGradle {
                    sh 'gradle bootJar'
                }
            }
        }
    }
}
