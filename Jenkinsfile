node {


        echo 'checkout to devlop'
        checkout([$class: 'GitSCM', branches: [[name: '*/develop']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/nadimcse/spring-boot-hello-world-example.git']]])

    stage('build') {
        echo 'hello world in develop'
        sh './mvnw clean install'
    }

}