# TaskManagerApi
TaskManagerAPI

## Purpose
This project contains the API specification (contract) for the Task Manager Service.
This service is used to manage tasks, allowing users to create a new task, retrieve a task,
retrieve all tasks managed by the task management system and update the status of a task. Tasks
are set with a due date, excluding weekends and bank holidays from the available dates.

## Project Structure
This is a standard maven project using spring boot to generate classes from openapi.yaml swagger specification.

| Directory/File                 | Purpose                                 |
|--------------------------------|-----------------------------------------|
| src/main/resources/openapi.yaml| OpenAPI3 specification for the contract |

## Code generation
This project uses the latest `swagger-codegen-maven-plugin` to generate POJOs from the OpenAPI specification.

You can generate the code by running the Maven command:

```
mvn clean generate-sources
```

This will generate the code under `target/generated-sources`

## TODO

- Looking at auto generating API testing to ensure code standardisation when generating from the API. 