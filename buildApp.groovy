def call() {
    echo "Building application containers"

    sh 'docker compose build'
}
