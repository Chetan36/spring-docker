FROM maven:3.3-jdk-8

# Create app directory
WORKDIR /usr/src/app/demo

COPY . .

RUN mvn clean install
RUN cd target/

EXPOSE 8091
CMD ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
