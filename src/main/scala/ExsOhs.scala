//import org.scalatest._

object ExesAndOhsTest extends App {
  val str="xxoo"
  var x=0
  var o=0
  for(i<-0 to str.length-1)
      if(str(i).toString().equalsIgnoreCase("o"))
       x=x+1
      else if(str(i).toString().equalsIgnoreCase("x"))
       o=o+1

  if(x==o)
    println(true)
  else
   println(false)

}







