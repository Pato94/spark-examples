# Spark - Aplicación Básica

La aplicación lee las lineas del archivo que se le pasa como parametro, y como resultado muestra en stdout la cantidad de lineas que contienen la letra "a" y la cantidad de lineas que contienen la letra "b"


## How to run
```
sbt package
spark-submit --class SimpleApp target/scala-2.11/spark-hello-world_2.11-0.1.jar src/main/res/input.txt
```