FROM amazoncorretto:21

WORKDIR /app

COPY ./ /app/

RUN ./gradlew build

EXPOSE 8080

CMD ["java", "-Xdebug", "-jar", "/app/build/libs/iibc-1.0.0.jar"]