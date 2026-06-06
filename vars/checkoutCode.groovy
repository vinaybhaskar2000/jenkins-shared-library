def call(String repoUrl, String branchName)
{
   echo "Checking out code from ${repoUrl}"
  git branch: branchName,
    url:repoUrl

}
