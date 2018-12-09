import org.apache.spark.sql.SparkSession

object SparkSQLExample {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder.appName("Spark SQL Example").getOrCreate()

    val starWarsPeople = spark.read.json("star_wars.json")
    starWarsPeople.createTempView("people")

    // We're doing a SQL query on a json file!
    val yellowEyedPeople = spark.sql("SELECT name FROM people WHERE eye_color = 'yellow'")

    yellowEyedPeople.foreach(r => println(s"Result: $r"))
    spark.stop()
  }
}
