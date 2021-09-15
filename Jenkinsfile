pipeline{
    
    agent any
	environment{
		PATH = "/opt/maven3/bin:$PATH"
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
