# Kotlin Test Spring Boot Application

This is an example Kotlin Rest API built by _darwin_face_

To run, use either `gradle bootRun`, or using your respective IDE of choice, it should be runable within.

Once running, you can go to `localhost:8080` and see a small example JSON payload, or go to `localhost:8080/butt/{name}`
and see an example REST call that takes in a URL Path Parameter.

### TODO:
* add Swagger
* add `docker` this with a `POSTGRES` DB
* add `liquibase`
* add `mybatis`
* add `splunk` to logging
* see about logging - maybe use `slf4j` or `log4j`?
    * does kotlin have it's own logging library?
* add a POST call example

### Possible Future Ideas:
- add GraphQL to make strict contracts between the FE/BE