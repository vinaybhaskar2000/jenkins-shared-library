def call(Map config=[:])
{
  stage('Checkout')
  {
    echo "Checking out Code From  ${repoUrl}"
    git ( 
      url = config.repoUrl,      
      ranch: config.branchName 
            
        )
      
  }

}
