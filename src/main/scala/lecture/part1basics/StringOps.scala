package lecture.part1basics

object StringOps extends App{
  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2)) // It have methods: substring, split, split.toList, replace, toLowerCase, length
  // Scala have access to String class in Java

  val aNumberString = "45"
  val aNumber = aNumberString.toInt // Convers String to Int, I could preppending and appending
  println('a' +: aNumberString :+ 'z')

  // String interpolators, para añadir variables dentro del String
  // S- interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old"
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1} years old"

  println(greeting)
  println(anotherGreeting)

  // F-interpolators display with format (2.2f en este caso)
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute"

  println(myth)

  // raw-interpolator
  println(raw"This is a \n newline")
  val escaped = "this is a \n newline"
  println(raw"$escaped")
}
