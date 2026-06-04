def call()
{
  archiveArtifacts artifacts: '**/target/surefire-reports/**/*'
}
