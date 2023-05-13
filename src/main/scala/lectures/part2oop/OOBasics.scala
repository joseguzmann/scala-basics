package lectures.part2oop

object OOBasics extends App{
  val person = new Person("John", 26)
  println(person.age)
  person.greet("Daniel")
}

// Create a class
// Constructor is class Person()
class Person(name: String, val age: Int) {
  // body can have => val var definitions, function definitions (methods), expressions, packages other classes, etc.
  val x = 2 // val vars declared here are fields

  // method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")
  // Method overloading
  def greet(): Unit = println(s"Hi, I am $name") // Here name is this.name

    // multiple constructors
    def this(name: String) = this(name, 0)
}

// Class parameters are NOT FIELDS
// Para hacerlo field se debe agregar val or var antes del parametro
