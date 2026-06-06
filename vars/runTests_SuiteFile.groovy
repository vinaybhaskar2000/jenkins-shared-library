def call(String suiteFile) {

    echo "Running Suite: ${suiteFile}"

    bat "mvn test -DsuiteXmlFile=${suiteFile}"
}
