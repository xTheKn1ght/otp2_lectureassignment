pipeline {
    agent any
    tools {
        maven 'Maven3'
    }

    environment {
     PATH = "C:\\Program Files\\Docker\\Docker\\resources\\bin"
           JAVA_HOME = 'C:\\Users\\xdd\\.jdks\\ms-17.0.16'
        SONARQUBE_SERVER = 'SonarQubeServer'
        SONAR_TOKEN = 'Sonar_Token'
        DOCKERHUB_CREDENTIALS_ID = 'Docker_Hub'
        DOCKERHUB_REPO = 'aaronly123/calculator'
        DOCKER_IMAGE_TAG = 'latest'


    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/xTheKn1ght/otp2_lectureassignment'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('SonarQube Analysis') {
                    steps {
                        withSonarQubeEnv('SonarQubeServer') {
                            bat """
                                ${tool 'SonarScanner'}\\bin\\sonar-scanner ^
                                -Dsonar.projectKey=devops-demo ^
                                -Dsonar.sources=src ^
                                -Dsonar.projectName=DevOps-Demo ^
                                -Dsonar.host.url=http://localhost:9000 ^
                                -Dsonar.login=${env.SONAR_TOKEN} ^
                                -Dsonar.java.binaries=target/classes
                            """
                        }
                    }
                }



        stage('Build Docker Image') {
                    steps {
                        script {
                            docker.build("${DOCKERHUB_REPO}:${DOCKER_IMAGE_TAG}")
                            // Or specify Dockerfile path explicitly if needed
                            // docker.build("${DOCKERHUB_REPO}:${DOCKER_IMAGE_TAG}", "-f ./Dockerfile .")
                        }
                    }
                }

                stage('Push Docker Image to Docker Hub') {
                    steps {
                        script {
                            docker.withRegistry('https://index.docker.io/v1/', DOCKERHUB_CREDENTIALS_ID) {
                                docker.image("${DOCKERHUB_REPO}:${DOCKER_IMAGE_TAG}").push()
                            }
                        }
                    }
                }
    }
}