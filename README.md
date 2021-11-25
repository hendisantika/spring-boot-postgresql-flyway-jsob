# spring-boot-postgresql-flyway-jsob

### Things todo list

1. Clone this repository: `git clone https://github.com/hendisantika/spring-boot-postgresql-flyway-jsob.git`
2. Navigate to the folder: `cd spring-boot-postgresql-flyway-jsob`
3. Run docker container:

```shell
docker pull postgres:14
docker run -d --rm --name pg14 -e POSTGRES_USER=user -e POSTGRES_PASSWORD=password -e POSTGRES_DB=coursedb -p 5432:5432 postgres:14
# CREATE db coursedb
docker exec pg14 psql -U user -c "CREATE DATABASE coursedb" postgres
```

4. Run the application: `mvn clean spring-boot:run`
5. Open your favorite browser: http://localhost:8080/courses
6. Open your favorite browser: http://localhost:8080/teachers

Article Link: https://developer.okta.com/blog/2019/02/20/spring-boot-with-postgresql-flyway-jsonb
