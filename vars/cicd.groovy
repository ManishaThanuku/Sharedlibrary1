def newDownload(repo)
{
  git "https://github.com/intelliqittrainings/${repo}.git"
}

def newBuild()
{
  sh 'mvn package'
}
def newDeploy(jobname,ip,appname)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war
  ubuntu@${172.31.40.98}:/var/lib/tomcat9/webapps/${testapp}.war"
}
def runselenium(jobname)
{
  sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}
