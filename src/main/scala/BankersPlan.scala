object BankersPlan extends App {
   val f0=100000
   val c0=10000
   val p=1
   val i=1
   val n=10
   val res=calculateLiving(f0,p,c0,n,i)
   println(res)
  def calculateLiving(f: Int, p: Int, c: Int,n: Int, i: Int):Boolean={
    //var i=1
    var fx=f.toDouble
    var cx=c.toDouble
    if(n>0) {
      fx=fx+((p.toDouble/100)*fx)-cx
    cx=cx+((i.toDouble/100)*cx)
      println(fx)
      //println(cx)
      if(fx.toInt<0)
        false
      else{
        calculateLiving(fx.floor.toInt,p,cx.floor.toInt,n-1,i)
      }
    }
    else
      true


  }

}
