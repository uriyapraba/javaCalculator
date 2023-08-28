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
                    sh "mvn clean test sonar:sonar \
                        -Dsonar.projectKey=sonar-maven \
                        -Dsonar.host.url=http://13.210.72.238:9000 \
                        -Dsonar.login=sqp_bb17797a98e7b975d83cf0bc0fab5e089c98116b"
                }
            }
        }
    }
}