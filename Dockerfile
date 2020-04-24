FROM maven:3.4 AS
WORKDIR /code
COPY ./ /code
RUN mvn package

FROM java:8
COPY --from /code/target/*.jar /app.jar
CMD java -jar /app.jar

