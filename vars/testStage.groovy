def call(String suiteFile)
{

  stage('Run Tests')
  {
    echo "Running Suite: ${suiteFile}"
    bat "mvn test -DsuiteXmlFile=${suiteFile}"

  }



}
