####  Steps to configure Lense.IO
```
docker run --rm -d -p 2181:2181 -p 3030:3030 -p 8081-8083:8081-8083 \
       -p 9581-9585:9581-9585 -p 9092:9092 -e ADV_HOST=localhost \
       landoop/fast-data-dev:latest
```      

#### Steps to configure Confluent Paltform

```
git clone https://github.com/confluentinc/examples
cd examples
git checkout 5.3.1-post
cd cp-all-in-one/
docker-compose up -d --build
docker-compose ps
```
