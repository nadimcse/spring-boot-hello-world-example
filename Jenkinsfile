node('aaa') {

    stage('checkout') {
        echo 'checkout to devlop'
        checkout([$class: 'GitSCM',
                  branches: [[name: '*/develop']],
                  doGenerateSubmoduleConfigurations: false,
                  extensions: [[$class: 'RelativeTargetDirectory',
                                relativeTargetDir: 'different_directory']],
                  submoduleCfg: [],
                  userRemoteConfigs: [[url: 'https://github.com/nadimcse/spring-boot-hello-world-example.git']]])
    }
    stage('build') {
        echo 'hello world in develop'
        sh './mvnw clean install'
    }

}