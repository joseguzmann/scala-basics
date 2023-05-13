package lecture.part1basics

object CBNvsCBV extends App{
  def calledByValue(x: Long): Unit = { // Call by value, el valor se evalúa antes de pasarlo como argumento, se evalua solo una vez y el valor resultante se pasa a la funcion
    println("by value: " + x)
    println("by value: " + x)
  }

  def calledByName(x: => Long): Unit = { // => tells the compiler that the parameter will be called by name | El argumento se pasa como una expresión sin evaluarla de inmediato
    println("by name: " + x)
    println("by name: " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  
}
