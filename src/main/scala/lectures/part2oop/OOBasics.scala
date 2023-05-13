package lectures.part2oop

object OOBasics extends App{
  val person = new Person("John", 26)
  println(person.age)
}

// Create a class
// Constructor is class Person()
class Person(name: String, val age: Int) {
  // body can have => val var definitions, function definitions (methods), expressions, packages other classes, etc.
  val x = 2 // val vars declared here are fields

  def greet(name: String): Unit = println(s"$name says: Hi, $name")
}

// Class parameters are NOT FIELDS
// Para hacerlo field se debe agregar val or var antes del parametro
