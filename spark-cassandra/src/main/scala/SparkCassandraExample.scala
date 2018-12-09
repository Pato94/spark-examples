import org.apache.spark.SparkContext
import com.datastax.spark.connector._

object SparkCassandraExample {
  def main(args: Array[String]) {
    val sc = new SparkContext()

    val rdd = sc.cassandraTable("nosql", "materias_por_alumno")
    rdd.foreach(r => println(s"Record from cassandra: $r"))
    sc.stop()
  }
}
