import com.sun.xml.internal.fastinfoset.util.CharArray

object SmallestDig extends App{
 /* print("Enter a number:")
  val num=scala.io.StdIn.readLong()

  var s=0L
  var pos=0
  var ind=0
  var res = new Array[Int](3)
  var carr=""
  var subst1=num.toString()
  while(subst1.length>0)
  {
    s = smallest(subst1.toLong)
     ind = num.toString.lastIndexOf(s.toString)
    //println(pos)
    if (pos == ind) {
      pos += 1
      subst1=num.toString().substring(pos)
    }else if(ind==num.toString.length-1)
      {
        carr=num.toString()
        carr=swap(carr,pos,ind)
        res(0)=carr.toInt
        res(1)=pos
        res(2)=ind
        subst1=""
      }
    else
    {
      carr=num.toString()
      carr=swap(carr,ind,pos)
      val num1=carr.toInt
      carr=num.toString()
      carr=swap(carr,pos,ind)
      val num2=carr.toInt
      if(num1<=num2) {
        res(0)=num1
        res(1)=pos
        res(2)=ind
      }
      else {
        res(0)=num2
        res(1)=ind
        res(2)=pos
      }
      subst1=""
    }
    if(pos==num.toString().length)
      {
        res(0)=num.toInt
        res(1)=0
        res(2)=0
        subst1=""
      }
  }
  println("Array("+res.mkString(",")+")")

def swap(ca:String,i:Int,j:Int):String={
   var s=""
  //val temp=ca(i)
  //ca(i)=ca(j)           12345     (3,0)   14235
  //ca(j)=temp            01234
  if(i<j)
    {
      if(i!=0)
      s=ca.substring(0,i-1)+ca.substring(i+1,j-1)+ca(i)+ca.substring(j+1,ca.length-1)
      else if(j==1)
      s=ca.substring(i+1,0)+ca(i)+ca.substring(j+1,ca.length-1)
      else
        s=ca.substring(i+1,j-1)+ca(i)+ca.substring(j+1,ca.length-1)
    }
   else
  {
    if(j!=0)
      s=ca.substring(0,j-1)+ca(i)+ca.substring(j+1,i-1)+ca.substring(i+1,ca.length-1)
    else if(i==1)
      s=ca(i)+ca.substring(j+1,ca.length-1)+ca.substring(i+1,ca.length-1)
    else
      s=ca(i)+ca.substring(j+1,i-1)+ca.substring(i+1,ca.length-1)
  }
}

  //println(s)

  def smallest(number:Long):Long={
    number<10 match{
      case true=>  number
      case other=>  scala.math.min(number%10,smallest(number/10))
    }
  }*/
}
