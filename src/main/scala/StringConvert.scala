object StringAppend extends App {
  print("Enter a number:")
  val num=scala.io.StdIn.readInt()
  val str1=get5charString(num)
  println(str1)
  def get5charString(num:Int):String={
    if(num<0)
      "0"*5
    else if(num>99999)
      {
         val str=num.toString()
         val str5=str.substring(0,5)
         str5
      }
    else{
      val len=num.toString().length
      "0"*(5-len)+num.toString()
    }
  }
}