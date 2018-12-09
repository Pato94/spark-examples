import org.apache.spark.sql.SparkSession
import com.redislabs.provider.redis.toRedisContext

object SparkRedisExample {
  def main(args: Array[String]) {
    val spark = SparkSession
      .builder
      .appName("Spark Redis Example")
      .config("spark.redis.host", "localhost")
      .config("spark.redis.port", "6379")
      .getOrCreate()

    val keysRDD = spark.sparkContext.fromRedisKeyPattern("foo*", 2)

    keysRDD.foreach(s => println(s"Value read from redis: $s"))

    spark.stop()
  }
}
