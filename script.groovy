def buildApp(){
  echo 'building the application...'
}

def testApp(){
  when {
    expression {
      params.executeTests
    }
  }
  steps {
    echo 'testing application...'
  }
}

def deployApp(){
  steps {
    echo "deploying the application version ${params.VERSION}"
}

return this
