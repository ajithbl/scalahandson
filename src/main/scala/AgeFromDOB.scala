import java.text.SimpleDateFormat
import java.time.LocalDate
import java.util.Calendar
import java.time.Period

object AgeFromDOB extends App{
  print("Enter DOB:")
  val str=scala.io.StdIn.readLine()
  print("Enter Date format:")
  val format1=scala.io.StdIn.readLine()
  //println(str.length)
  str.age(format1)

  implicit class StringUtils(s:String) {
    def age(dateformat1:String): Unit ={
      var bday=""
      dateformat1 match {

        case "dd-mm-yyyy" => bday = s.substring(6, 10) + "-" + s.substring(3, 5) + "-" + s.substring(0, 2)
        case "ddmmyyyy" => bday = s.substring(4, 8) + "-" + s.substring(2, 4) + "-" + s.substring(0, 2)
        case "mmddyyyy" => bday = s.substring(4, 8) + "-" + s.substring(0, 2) + "-" + s.substring(2, 4)
        case "yyyy-mm-dd" => bday = s
        case _ => println("This is an invalid format")

      }
          //Now access the values as below
          val currentDate1=java.time.LocalDate.now.toString
          val p = Period.between(LocalDate.parse(bday), LocalDate.parse(currentDate1))
          print(p.getYears+"Y")
          print(p.getMonths+"M")
          println(p.getDays+"D")

    }





  }
}
