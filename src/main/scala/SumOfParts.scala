object SumOfParts extends App{

  val str = scala.io.StdIn.readLine()
  val elems=str.split(",")
  var l=List[Int]()
  for(ele<-elems)
    l=l:+ele.toInt
   l.foreach(println)
   val res=partsSums(l)
   res.foreach(println)
  val rl=l.reduceLeft(_+_)
  val rr=l.reduceRight(_+_)
  val fl=l.foldLeft(5)(_+_)
  val fr=l.foldRight(5)(_+_)
  val xx=List(1,3,5).foldLeft(List[String]()) { (a, b) => b.toString :: a }
  println(rl+" "+rr+" "+fl+" "+fr+" "+xx)
  val resWithScan=l.scanLeft(0)(_+_)
  println(resWithScan)

  def partsSums(l: List[Int]): List[Int] ={
     var res=List[Int]()
     var ind=0
     var prevsum=l.sum
  if(l==null)
    res
    else {
    while (ind < l.length) {
      val sum = prevsum

      res = res :+ sum
      prevsum = prevsum - l(ind)
      ind = ind + 1
    }
    res = res :+ 0
    res
    }
  }


      //l=ele.toInt::l
    // var dk = List[Map[String,AnyRef]]()
    //dk=Map("1"->"ok")::dk or dk::=Map("1"->"ok")


}
