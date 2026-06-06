def call(Map config = [:])
{
  stage('Checkout')
  {
    echo "Checking out Code From  ${config.repoUrl}"
    git ( 
      url = config.repoUrl,      
      branch: config.branchName 
            
        )
      
  }

}
