FROM maven:3.6.3-jdk-11-slim
WORKDIR /app
COPY . .
RUN mvn clean package
ENTRYPOINT ["java","-jar","/app/target/animalshelter-0.0.1.jar"]
