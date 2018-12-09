# Aplicación Básica - Spark Cassandra

La aplicación se conecta a un cassandra local y imprime las rows de la tabla nosql.materias_por_alumno

## Setup
Este proyecto consulta un cassandra local, para ver resultados es conveniente insertar los siguientes datos
```
create table materias_por_alumno ( legajo text, nombre_materia text, curso text, primary key ((legajo), nombre_materia) );
insert into materias_por_alumno (legajo, nombre_materia , curso) values('139.240-1', 'Algebra', 'Z1003');
insert into materias_por_alumno (legajo, nombre_materia , curso) values('139.240-1', 'GDD', 'K001');
insert into materias_por_alumno (legajo, nombre_materia , curso) values('139.240-1', 'NoSQL', 'K5001');
```

## How to run
```
sbt package
spark-submit --packages datastax:spark-cassandra-connector:2.4.0-s_2.11 target/scala-2.11/spark-cassandra_2.11-0.1.jar 
```

## Expected output
```
Record from cassandra: CassandraRow{legajo: 139.240-1, nombre_materia: Algebra, curso: Z1003}
Record from cassandra: CassandraRow{legajo: 139.240-1, nombre_materia: GDD, curso: K001}
Record from cassandra: CassandraRow{legajo: 139.240-1, nombre_materia: NoSQL, curso: K5001}
```