def call() {
    echo "Checking application containers"

    sh 'docker compose ps'

    sh '''
        docker compose ps --status running --services
    '''
}
