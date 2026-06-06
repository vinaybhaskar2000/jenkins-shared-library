import org.framework.utils.MavenUtils

def call(Map config) {

    def command = MavenUtils.getMavenCommand(
        config.browser,
        config.suiteName
    )

    bat command
}
