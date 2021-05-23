object NarcNum extends App {
  print("Enter a number:")
  val num=scala.io.StdIn.readInt()
  val sum1=num.toString().map(x=>scala.math.pow(x.asDigit,num.toString.length).toInt).sum
  //println(sum1)
  if(sum1==num)
    true
  else
    false

  /*def pow1(i1:Int,i2:Int):Double={
     scala.math.pow(i1,i2)
  }*/
}


