object Result {

    def aVeryBigSum(ar: Array[Long]): Long = {
    var temp :Long = 0
    for (a <- ar)
    {
      temp += a
      }
      temp
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val arCount = StdIn.readLine.trim.toInt

        val ar = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toLong)

        val result = Result.aVeryBigSum(ar)

        printWriter.println(result)

        printWriter.close()
    }
}
