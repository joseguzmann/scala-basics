package lecture.part1basics

object ValuesVariablesTypes extends App {
  // Values
  val x: Int = 42
  println(x)

  // VALS ARE IMMUTABLE
  // COMPILER can infer types
  // Types: Int, String, Boolean, Char, Short, Long, Float (2.0f), Double (2.0)

  val aString: String = "s"
  val aBoolean: Boolean = false
  val aChar: Char = 'a'

  // Variables
  var aVariable: Int = 4 // side effects
  aVariable = 5
}
