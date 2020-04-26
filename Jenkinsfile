node {
    
    stage('Clone') {
    git  "https://github.com/lamine1305/jenkins.git"
}
    stage('Build') {
            sh "cd src/ && javac Main.java"
}
    stage('Run') {
                    sh "cd src/ && java Main"
    }
    
}
