FROM clojure
RUN mkdir -p /usr/src/app/demo-site
WORKDIR /usr/src/app/demo-site
COPY project.clj /usr/src/app/demo-site
RUN lein deps
COPY . /usr/src/app/demo-site
