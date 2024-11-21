## Requirements
1. Java 17
2. Docker compose
3. Spring boot 3
4. Postgres
5. Liquibase

## IntelliJ IDEA

#### Specify project SDK version and gradle SDK version.

1. File -> Project Structure -> Project Settings -> Project -> SDK -> Java17
2. File -> Settings -> Build, Execution, Deployment -> Build Tools -> Gradle -> Distribution -> Wrapper
3. File -> Settings -> Build, Execution, Deployment -> Build Tools -> Gradle -> Gradle JVM -> Java17
   ![img_1.png](img_1.png)
   ![img_4.png](img_4.png)

## Start application. Option 1
1. Docker compose up

        docker-compose up -d
2. Build application jar

        ./gradlew build -x test
3. Apply migrations

        ./gradlew update

## Start application. Option 2. Gradle plugin
1. Docker compose up

        docker-compose up -d
2. Build application jar

        Open gradle plugin -> build -> build (run build configuration)
3. Apply migrations

        Open gradle plugin -> liquibase -> update (run update configuration)

## Test

1. Run tests

        ./gradlew test


- посмотреть зависимости в билд градле
- там спринг секьюрити, вебфлюкс
- посмотреть в аппликейшн пропертис
- посмотреть в бд что за таблицы

- задачи на факториал (логику сделай просто через цикл или через рекурсию)
- если необходима оптимизация, то можно добавить кэш в виде мапки, чтобы не пересчитывать каждый раз значения

- написание запросов spring data jpa

### URLs
1. GET  http://localhost:8089/public/v1/factorial/{num}
2. POST http://localhost:8089/api/v1/fact
3. GET  http://localhost:8089/api/v1/products