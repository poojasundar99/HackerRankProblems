object Result {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    def reverseArray(a: Array[Int]): Unit = {
    // Write your code here
    var i=0
    var temp = 0
    var j=a.length-1
    while(i<=j)
    temp = a(i)
    a(i)=a(j)
    a(j)=temp
    i+=1
    j=j-1
    println(util.Arrays.toString(a))
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val arrCount = StdIn.readLine.trim.toInt

        val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val res = Result.reverseArray(arr)

        printWriter.println(res.mkString(" "))

        printWriter.close()
    }
}
