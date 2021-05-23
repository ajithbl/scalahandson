object SumOfDigits extends App{
  print("Enter a number:")
  val num=scala.io.StdIn.readLine()
  val sum=getSumOfDigits(num)
  println(sum)
  def getSumOfDigits(num:String):String={
     var sum=0
      if(num.length==1)
         num
      else
        getSumOfDigits(num.map(_.asDigit).sum.toString)
  }

}
