object ChangeCase extends App {
  print("Enter a string:")
  val str=scala.io.StdIn.readLine()
   val str1=str.map(c=>if(c.isUpper) c.toLower else c.toUpper)
   println(str1)
}
