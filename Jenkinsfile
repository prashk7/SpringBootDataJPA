pipeline{
    
    agent any
   
    stages{
        stage("Welcome"){
            steps{
                git 'https://github.com/prashk7/SpringBootDataJPA'
            }
            
        }
		stage("Maven Build"){
		
			steps{
			
				sh "./mvnw spring-boot:run"
				
			}
		
		}
        
    }
    
    
    
}
