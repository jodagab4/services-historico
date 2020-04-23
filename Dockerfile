FROM openjdk:13
VOLUME /tmp
EXPOSE 8808
ADD ./target/services-historico-0.0.1-SNAPSHOT.jar service-historico.jar
ENTRYPOINT  ["java","-jar","/service-historico.jar"]