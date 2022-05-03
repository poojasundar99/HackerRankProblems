object Result {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    def simpleArraySum(ar: Array[Int]):Int = {
    var arr = 0
    for (i <- ar)
    {
      arr += i
      }
      arr

}
}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val arCount = StdIn.readLine.trim.toInt

        val ar = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val result = Result.simpleArraySum(ar)

        printWriter.println(result)

        printWriter.close()
    }
}
