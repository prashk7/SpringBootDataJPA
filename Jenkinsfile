pipeline{
    
    agent any
    tools {
       maven 'M2_HOME'
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
