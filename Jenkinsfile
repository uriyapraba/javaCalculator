pipeline
{
    agent
    {
        label 'slave1'
    }
    tools
    {
        maven 'maven-3.9.4'
    }
    stages
    {
        stage('SCM_Checkout')
        {
            steps
            {
                checkout scmGit(branches: [[name: 'origin/master']],
                userRemoteConfigs: [
                    [ url: 'https://github.com/uriyapraba/javaCalculator.git' ]
                ])
            }
        }
        /*stage('maven build')
        {
            steps
            {
                sh 'mvn clean test'
            }
        }*/
        stage('sonar-scanner')
        {
            steps
            {
                withSonarQubeEnv('sonarqube-9')
                {
                    sh 'mvn clean test sonar:sonar'
                }
            }
        }
    }
}