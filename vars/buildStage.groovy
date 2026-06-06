def call()
{
  stage('Build')
  {
    echo "Building Maven Project"
    bat "mvn clean compile"
  }



}
