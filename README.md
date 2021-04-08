# encryptdecrypt-service
encryptdecrypt-service

https://stackoverflow.com/questions/27767264/how-to-dockerize-maven-project-and-how-many-ways-to-accomplish-it

$ mvn clean package docker:build
$ docker images
$ docker run -p 8080:8080 -t <image name>

docker build -t srinitestdocker1/encryptdecrypt-service .
docker login
docker push srinitestdocker1/encryptdecrypt-service

