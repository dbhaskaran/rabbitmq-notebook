# rabbitmq-notebook
A repository for learning and mastering rabbit-mq AMQP using Java for client programming 🐇☕

#### Prerequisite:
- [Java Development Kit](http://www.oracle.com/technetwork/java/javase/downloads/index-jsp-138363.html)
- [Eclipse IDE](http://www.eclipse.org/downloads/packages)
- Maven
- Docker

#### Rabbit MQ Notebook
1. Hello World

#### Docker Containers
RabbitMQ on Docker:
```shell
$ docker run -dit --name rabbitmq_server -p 5672:5672 -p 15672:15672 -e RABBITMQ_DEFAULT_USER=admin -e RABBITMQ_DEFAULT_PASS=admin rabbitmq:3.6.12-management
```
You will be able to access the RabbitMQ management console on http://localhost:15672 and login using username:"admin" and password:"admin"

---
##### Reference:
- [Head First Java, 2nd Edition](https://www.amazon.com/Head-First-Java-Kathy-Sierra/dp/0596009208)
- [Core Java Volume I--Fundamentals (10th Edition)](https://www.amazon.com/Core-Java-I-Fundamentals-10th/dp/0134177304)
- [Core Java, Volume II--Advanced Features (10th Edition)](https://www.amazon.com/Core-Java-II-Advanced-Features-10th/dp/0134177290)
- [Core Java for the Impatient](https://www.amazon.com/Core-Java-Impatient-Cay-Horstmann/dp/0321996321)
- [Java SE8 for the Really Impatient](https://www.amazon.com/Java-SE8-Really-Impatient-Course/dp/0321927761)
- [Rabbit MQ Java Client](https://mvnrepository.com/artifact/com.rabbitmq/amqp-client/5.0.0)
-