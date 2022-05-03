object Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    def compareTriplets(a: Array[Int], b: Array[Int]):Array[Int] = {
    var aa= 0
    var bb= 0
    
    if(a(0)>b(0))
    { aa =aa+ 1
    }
    else if(b(0)>a(0)) 
    {
    bb =bb+ 1

    }
    
    if(a(1)>b(1)) 
    {
    aa= aa+ 1
    } 
    else if(b(1)>a(1)) 
    {
    bb =bb + 1
    }
  
    
    if(a(2)>b(2)) aa= aa+ 1
    else if(a(2)<b(2))  bb=bb+ 1
    else aa=bb
    
    Array(aa.toInt,bb.toInt)
}
}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val a = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val b = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val result = Result.compareTriplets(a, b)

        printWriter.println(result.mkString(" "))

        printWriter.close()
    }
}
