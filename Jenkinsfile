pipeline {
   agent any

   tools {
      maven "M3"
   }

   stages {
      stage('Build') {
         steps {
            sh "mvn -DskipTests clean package"
         }
      }
      stage('Deploy') {
         steps {
            sh "cf login -a ${CF_API_URL} -u ${CF_USERNAME} -p ${CF_PASSWORD} -o ${CF_ORG} -s ${CF_SPACE}"
            sh "cf push pipeline-test -p target/pipeline-0.0.1-SNAPSHOT.jar"
         }
      }
   }

}