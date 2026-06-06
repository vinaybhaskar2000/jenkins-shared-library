package org.framework.utils

class MavenUtils {

    static String getMavenCommand(String browser, String suiteName) {

        return "mvn test -Dbrowser=${browser} -DsuiteXmlFile=${suiteName}.xml"
    }
}
