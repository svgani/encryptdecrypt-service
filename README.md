# encryptdecrypt-service
encryptdecrypt-service

https://stackoverflow.com/questions/27767264/how-to-dockerize-maven-project-and-how-many-ways-to-accomplish-it

$ mvn clean package docker:build
$ docker images
$ docker run -p 9083:9083 -t 543bd7

docker build -t srinitestdocker1/encryptdecrypt-service .
docker login
docker push srinitestdocker1/encryptdecrypt-service

h
