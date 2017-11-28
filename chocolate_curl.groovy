
def contentType = "application/json"
def postUrl = "http://localhost:8081/c417-factory/api/chocolate"
node {
  stage{
    dir("${WORKSPACE}") {
      def requestBody = $/
        {
          "butter": 0,
          "cacao": 0,
          "cocoaPowder": 0,
          "milk": 0,
          "sugar": 0
        }
      /$

      def response = sh(script:"curl -v -X POST --header 'Content-Type: ${contentType}' --header 'Accept: application/json' -d '${requestBody}' '${postUrl}}'", returnStdout: true)
      println (${response})
      println("TODO: curl result validation")
    }
  }
}
