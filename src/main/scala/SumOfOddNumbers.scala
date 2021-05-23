object SumOfOddNumbers  extends App{
   val n=5
     var str=""
      var k=1
      for(i<-1 to n)
      {
        str=""
        for(j<-1 to i)
        {
          str=str+" "+k
          k=k+2
        }
      //  println("")
      }
    println(str)
    println(str.trim().split(" ").foldLeft(0)(_.toInt+_.toInt))
}
