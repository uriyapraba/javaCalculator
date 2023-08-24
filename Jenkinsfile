pipeline
{
    agent
    {
        label 'slave'
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