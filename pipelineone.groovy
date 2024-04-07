pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                echo 'build done'
            }
        }
    }
}


        stage('test') {
            steps {
                echo 'test done'
            }
        }
    

    
        stage('deploy') {
            steps {
                echo 'deploy done'
            }
        }
    