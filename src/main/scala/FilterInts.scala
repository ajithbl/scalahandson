object FilterInts extends App {
  print("Enter a string:")
  val str=scala.io.StdIn.readLine()
  val str1=str.map(c=>if(c.toInt>=48 && c.toInt<=57)  print(c))
}
