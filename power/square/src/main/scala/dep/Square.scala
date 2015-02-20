package dep

object Square extends App {
 def calculate(numberStr:String)={
  val number = numberStr.toLong
  number*number*2
}
   //println("Square="+calculate(args(0)))
}
