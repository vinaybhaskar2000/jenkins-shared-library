def call(String suiteName)
{
  bat "mvn clean test -Pqa -DsuiteXmlFile=${suiteName}"
}
