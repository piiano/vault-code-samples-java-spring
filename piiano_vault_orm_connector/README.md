# openapi-java-client

Demo application using Piiano Vault.

## Requirements

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)
3. Compiled piiano-vault-orm-connector-0.0.1-SNAPSHOT.jar (run `make` in the parent directory)
4. Docker

## Installation

To run the Vault you will need to issue a free 30-days license from [get-started](https://piiano.com/docs/guides/get-started) and set it to an environment variable `PVAULT_SERVICE_LICENSE`. 

Run locally using `./run.sh` from a Mac or Linux machine.
To enable interactive mode, run `./run.sh -i`.

### Alternative Manual Instructions

The boot
1. Mysql:
- docker run --name mysql -e MYSQL_ROOT_PASSWORD=rootpass -p 3306:3306  -d  mysql:8.0.30
- You will require mysql CLI. If you don't have it installed you can run it from the mysql container: `docker exec -it mysql mysql`
- Create the mysql Database ([taken from here](https://spring.io/guides/gs/accessing-data-mysql/#initial)):
```
mysql --password
create database app_db;
create user 'springuser'@'%' identified by 'userpass';
grant all on app_db.* to 'springuser'@'%';
```
- the app connects to mysql using configuration in src/main/resources/application.properties
      spring.datasource.url=jdbc:mysql://localhost:3306/app_db
      spring.datasource.username=springuser
      spring.datasource.password=userpass

2. Piiano vault
- Install Piiano Vault - step 1 & 2 on [get-started](https://piiano.com/docs/guides/get-started)
- Create collection for user's emails
```
pvault collection add --collection-pvschema "
users PERSONS (
  email EMAIL ENCRYPTED,
)"
```

3. Run the Piiano ORM Demo:
```
java -jar ~/.m2/repository/com/piiano/piiano-vault-orm-connector/0.0.1-SNAPSHOT/piiano-vault-orm-connector-0.0.1-SNAPSHOT.jar
```
