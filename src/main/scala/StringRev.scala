object StringRev extends App{
 print("Enter a string:")
  val str=scala.io.StdIn.readLine()
   val len=str.length-1
   for(i<- len to 0 by -1)
     print(str(i))

 }

