def call(String env, String browser, String suiteName) {

    bat "mvn clean test -P${env} -Dbrowser=${browser} -DsuiteXmlFile=${suiteName}"
}
