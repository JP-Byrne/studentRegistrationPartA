pipeline {
	  
	  agent any
	  
	  tools {
	    gradle 'Gradle'
	  }
	  
	  stages{
	    
	    stage("Compile Stage"){
	      
	      steps {
	        echo 'Compiling and building the project.'
	        bat "gradle clean compileJava"
	      }
	    }
	    
	    stage("Testing Stage"){
	      
	      steps {
	        echo 'Testing the project.'
	        bat "gradle test --tests sampleTest"
	      }
	    }
	

	    stage("Deployment Stage"){
	      
	      steps {
	        echo 'Deploying the project.'
	        bat "gradle war"
	      }
	    }
	  }
	}
