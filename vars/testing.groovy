import com.tothenew.Utility

def call(String name, String number, String address){
   object = new Utility() 

   pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                script{
            object.name(name, number, address)
                }
              
            }
        }
    }
}

 

}