package lecture.part1basics

object Expressions extends App{
  val x = 1 + 2 // Expression: are evaluated to a value
  // Math operators: + - * / & |  ^ << >> >>> (right shift with zero extension)
  println(x)

  // Changing variables are side effects

  // Instructions (tell the computer to do) vs expressions (fragmento de codigo que produce un valor)

  // IF expression
  val aCondition = false

  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionedValue)

  val aWhile = while(false) {

  }

  // DO NOT USE WHILE LOOPS

  // EVERYTHING in Scala is an Expression!

  var aVariable = 2;
  val aWeirdValue = (aVariable = 3) // Unit === void | Reassigning a variable is a side effect. Expresiones que retornan Unit son instrucciones
  println(aWeirdValue)

  // side effects: println(), whiles (puede producirlo), reassigning

  // Code blocks | Are expressions | The value of the block is value of the last expression
  val aCodeBlock = {
    val y = 2;
    val z = y + 1;

    if (z > 2) "hello" else "goodbye"
  }


}
