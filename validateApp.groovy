def call() {
    echo "Validating application configuration"

    sh '''
        test -f Dockerfile
        test -f docker-compose.yml
        docker compose config -q
    '''
}
