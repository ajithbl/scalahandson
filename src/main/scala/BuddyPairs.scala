object BuddyPairs extends App {
  print("Enter start & limit:")
  val str=scala.io.StdIn.readLine()
  val st=str.split(" ")
  val start=st(0).toLong
  val limit=st(1).toLong
  println(buddyPairs(start,limit))

def buddyPairs(start:Long,limit:Long):String={
  var n=start
  var m=0L
  while(n<=limit)
  {
    m=n*2

   // println(n+" "+sOfDivsN)
    while(m>n)
    {
      if(!isPrime(n) && !isPrime(m))
      {
        val sOfDivsN = sumOfDivisors(n)
        val sOfDivsM = sumOfDivisors(m)
        //println(m+" "+sOfDivsM)
        if (n == sOfDivsM && m == sOfDivsN)
          return (n, m).toString()
      }
       m=m-1
    }
    n=n+1
  }
  "Nothing"
}

  def isPrime(num:Long):Boolean =
    (num%2!=0)&& (List(3,5,7,9).forall(num % _ != 0))

  def sumOfDivisors(n:Long):Long={
    var sum=1
    var i=2
    while(i<=n/2)
    {
      if(n%i==0)
        sum=sum+i
      i=i+1
    }
    sum-1
  }
}
