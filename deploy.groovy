def call() {
    echo "Deploying Django Notes application"

    sh 'docker compose up -d'
}
