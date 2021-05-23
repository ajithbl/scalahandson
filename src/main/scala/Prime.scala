object Prime extends App {
  val n = scala.io.StdIn.readInt()
  (10 to n).map(x => println(x + " " + isPrime(x)))

  def isPrime(num:Int):Boolean =
    (num%2!=0)&& (List(3,5,7,9).forall(num % _ != 0))

}