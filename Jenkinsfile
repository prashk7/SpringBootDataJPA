pipeline{
    
    agent any
    tools {
        maven 'Maven 3.8.2'
    }
    stages{
        stage("Welcome"){
            steps{
                git 'https://github.com/prashk7/SpringBootDataJPA'
            }
            
        }
		stage("Maven Build"){
		
			steps{
			
				sh "mvn clean Package"
				
			}
		
		}
        
    }
    
    
    
}
