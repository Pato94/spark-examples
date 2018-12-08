import org.apache.spark.SparkContext

object SimpleApp {
  def main(args: Array[String]) {
    val spark = new SparkContext()
    val logData = spark.textFile(args(0)).cache()
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    println(s"Lines with a: $numAs, Lines with b: $numBs")
  }
}
