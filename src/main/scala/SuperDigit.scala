object SuperDigit extends App{
  print("Enter n & k:")
  val line=scala.io.StdIn.readLine()
  val nk=line.split(" ")
  val n=nk(0)
  val k=nk(1)
  val num=n*k.toInt
  val sum=getSumOfDigits(num)
  println(sum)
  def getSumOfDigits(num:String):String={
    var sum=0
    if(num.length==1)
      num
    else
      getSumOfDigits(num.map(_.asDigit.toLong).sum.toString)
  }

}
