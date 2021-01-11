#!/usr/bin/env bash
project=${parent.artifactId}

docker stop $project

docker rm $project

docker rmi $project

docker build -t $project:latest .

docker run -d --name=$project -p 8090:8090 -e SERVER_PORT=8090 -e PROFILE=pre $project --restart=always
