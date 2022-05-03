object BeautifulDays extends App 
{
var i = 54321
  var rev = 0
  System.out.println("Original: "+ i)
  while (i != 0) {
    val digit = i % 10
    rev = rev * 10 + digit
    i /= 10
  }
  System.out.println("Reversed: " + rev)
}