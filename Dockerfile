FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/demo-site.jar /demo-site/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/demo-site/app.jar"]
