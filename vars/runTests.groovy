def call()
{
  bat 'mvn clean test -Pqa -DsuiteXmlFile=testng_sanity.xml'
}
