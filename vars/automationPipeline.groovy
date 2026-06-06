def call(Map config) {

    pipeline {

        agent any

        parameters {

            choice(
                name: 'ENV',
                choices: ['QA', 'UAT'],
                description: 'Select Environment'
            )

            choice(
                name: 'BROWSER',
                choices: ['chrome', 'edge'],
                description: 'Select Browser'
            )
        }

        stages {

            stage('Checkout') {

                steps {

                    checkoutCode()
                }
            }

            stage('Run Tests') {

                steps {

                    runTests(
                        browser: params.BROWSER,
                        suiteName: config.suite
                    )
                }
            }

            stage('Reports') {

                steps {

                    publishReports()
                }
            }
        }
    }
}
