# Aplicación Básica - Spark Redis

La aplicación se conecta a un redis local y imprime las claves que matchean con la regex "foo*"

## How to run (With Spark 2.3.1)
```
sbt package
spark-submit --jars lib/spark-redis-2.3.1-SNAPSHOT-jar-with-dependencies.jar --class SparkRedisExample target/scala-2.11/spark-redis-example_2.11-0.1.jar
```

## Expected output
```
Value read from redis: foo
Value read from redis: fooaa
Value read from redis: fooa
```