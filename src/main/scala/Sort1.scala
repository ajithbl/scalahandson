import scala.collection.mutable.ListBuffer

object Sort1 extends App {

     var l=List(5,6,3,2,4,1)
     var l1:ListBuffer[Int]=ListBuffer()

   while(!l.isEmpty) {
       l1+=l.min
     l=l diff List(l.min)
   }
  println(l1)
}
