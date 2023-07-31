import com.tothenew.Utility

def call(String name, String number, String address){
   object = new Utility() 

   pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
               object.name(name, number, address)
            }
        }
    }
}

 

}