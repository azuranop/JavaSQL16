
import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext;
import org.apache.spark.sql.SQLContext;
import org.apache.spark.sql.DataFrame;
import org.apache.spark.api.java.JavaSparkContext;

public class JavaSQL {

    SparkConf conf = new SparkConf();
    SparkContext sc = new SparkContext(conf);
    SQLContext sqlContext = new org.apache.spark.sql.SQLContext(sc);

    DataFrame df = sqlContext.read().json("examples/src/main/resources/people.json");

    DataFrame dfnew = df.join(df);


//    df.show();
//    df.printSchema();
}
