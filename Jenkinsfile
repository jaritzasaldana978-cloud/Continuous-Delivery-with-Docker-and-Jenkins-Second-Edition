pipeline {
    agent any

    stages {

        stage('Check Branch') {
            steps {
                echo "Current branch: ${env.BRANCH_NAME}"
            }
        }

        stage('Build') {
            when {
                anyOf {
                    branch 'master'
                    expression {
                        env.BRANCH_NAME.contains('feature')
                    }
                }
            }
            steps {
                echo 'Running Build'
            }
        }

        stage('Test') {
            when {
                anyOf {
                    branch 'master'
                    expression {
                        env.BRANCH_NAME.contains('feature')
                    }
                }
            }
            steps {
                echo 'Running Tests'
            }
        }

        stage('CodeCoverage') {
            when {
                branch 'master'
            }
            steps {
                echo 'Running Code Coverage'
            }
        }

        stage('Invalid Branch') {
            when {
                not {
                    anyOf {
                        branch 'master'
                        expression {
                            env.BRANCH_NAME.contains('feature')
                        }
                    }
                }
            }
            steps {
                error("Invalid branch. Only master and feature branches are allowed.")
            }
        }
    }
}
