FROM maven:3.4 AS db
WORKDIR /code
COPY ./ /code
RUN mvn package

FROM java:8
COPY --from db /code/target/*.jar /app.jar
CMD java -jar /app.jar

