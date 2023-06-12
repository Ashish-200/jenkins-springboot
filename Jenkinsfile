pipeline {
    agent any
    stages{
        stage('build gradle service'){
            steps{
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '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', url: 'https://github.com/Ashish-200/jenkins-springboot.git']])
                sh './gradlew clean build'
            }
        }
        stage('build docker image')
        {
            steps{
                script{
                    sh 'docker build -t anshgoyal7078848866/springbootapp .'
                }
            }
        }
        stage('push to dockerhub')
{
    steps{
        script{
            
                sh 'docker login -u anshgoyal7078848866 -p Lentra@1234'
                sh 'docker push anshgoyal7078848866/springbootapp'
            
        }
    }
}
       
    }
}
