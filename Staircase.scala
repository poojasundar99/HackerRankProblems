object Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    def staircase(n: Int) {
    // Write your code here
    for(i<-Range(0,n)){
    var first=""
    var second=""
    first=" "*((n-1)-i)
    second="#"*(i+1)
    println(first+second)
  }

    }

}

object Solution {
    def main(args: Array[String]) {
        val n = StdIn.readLine.trim.toInt

        Result.staircase(n)
    }
}
