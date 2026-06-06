def call(String repoUrl, String branchName='main')
{
  stage('Checkout')
  {
    echo "Checking out Code From  ${repoUrl}"
    git ( branch: branchName, url = repoUrl)
      
  }

}
