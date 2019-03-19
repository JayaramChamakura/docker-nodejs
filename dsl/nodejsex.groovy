job('NodeJS example') {
    scm {
        git('git://github.com/JayaramChamakura/docker-nodejs.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('User')
            node / gitConfigEmail('dsl@jayaram.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // NodeJS Installations
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
