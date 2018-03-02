
pipeline {
    agent any
    tools {
        jdk 'jdk8'
        maven 'maven3'
    }
    stages {
        stage('Install') {
            steps {
                shell "mvn clean test"
            }
        }
    }
}
