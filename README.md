# Demo App
For training and practise purpose

## Prerequisites
You must have the following stuff installed
* JDK 8 or equivalent built of open JDK
  * [Zulu JDK](https://www.azul.com/downloads/zulu-community/)
  * [Open JDK](https://developers.redhat.com/products/openjdk/download)
* Maven 3
  * [download](https://maven.apache.org/download.cgi)

## Getting Started
### Building
Execute this command to build the app:
```shell script
$ cd demo
$ mvn clean package -DskipTests=true
```

### Run
```shell script
$ mvn spring-boot:run
```
And press `ctrl+c` to stop the app. 