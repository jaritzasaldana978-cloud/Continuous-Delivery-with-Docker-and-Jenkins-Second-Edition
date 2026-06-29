pipeline {
    agent any

    environment {
        GRADLE_USER_HOME = "${WORKSPACE}/.gradle"
    }

    stages {
        stage('Gradle Build With Cache') {
            steps {
                dir('Chapter08/sample1') {
                    sh './gradlew clean build --build-cache'
                }
            }
        }
    }

    post {
        always {
            echo 'Checking Gradle cache size'
            sh 'du -sh .gradle || true'
        }
    }
}
