# Aplicación Básica - SparkSQL

La aplicación lee el archivo star_wars.json y ejecuta una query SQL para mostrar resultados


## How to run
```
sbt package
spark-submit --class SparkSQLExample target/scala-2.11/spark-sql_2.11-0.1.jar 
```

## Expected output
```
Result: [C-3PO]
Result: [Darth Vader]
```