name := "spark-redis-example"

version := "0.1"

scalaVersion := "2.11.8"

unmanagedJars in Compile += file("lib/spark-redis-2.3.1-SNAPSHOT-jar-with-dependencies.jar")

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.3.1"
libraryDependencies += "redis.clients" % "jedis" % "2.9.0"
libraryDependencies += "org.apache.commons" % "commons-pool2" % "2.5.0"
//libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.3.1" % "provided"
