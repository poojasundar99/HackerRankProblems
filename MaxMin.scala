object MaxMin extends App {
  val a = Array(119, 1092, 3, 114, 5, 206)
  var maxNum = a(0)
  var minNum = a(0)
  var temp = 0

  for (i <- 1 to (a.length - 1)) {
    if (a(i) > maxNum) {
      maxNum = a(i)
    }
  }
  println(maxNum)


  for (i <- 0 until a.length - 1) {
    for (j <- 0 until a.length - 1) {
      if (a(j) < a(j + 1)) {
         temp = a(j)
        a(j) = a(j + 1)
        a(j + 1) = temp
      }
    }
  }
  for (aj <- a) {
    print(aj + " ")
  }

  println("the largest value " + a(0))

}
