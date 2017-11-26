def gitUrl = "https://github.com/c417-jenkins/chocolate-factory.git"
def targetBranch = "master"
node {
    stage("checkout") {
      dir("${WORKSPACE}") {
          git url: "${gitUrl}", branch: "${targetBranch}", credentialsId: "${ChocolateJenkins}"
          println("hello")
      }
    }

    stage("finish")
      println("see you")

}
