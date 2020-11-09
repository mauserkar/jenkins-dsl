#!/usr/bin/env groovy

pipeline {
    agent any
    stages { 
        stage('test') {
            steps {
                echo "Hello world"
            }
        }
        stage('build') {
            steps {
                echo "Hello world"
            }
        }
        stage('deploy') {
            steps {
                echo "Hello world"
            }
        }
    }
}
