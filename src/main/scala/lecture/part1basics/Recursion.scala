package lecture.part1basics

object Recursion extends App {

 def factorial(n: Int): Int = {
   if (n <= 1) {
     1
   } else {
     println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
     val result = n * factorial(n - 1)
     println("Computed factorial of " + n)
     result
   }
 }

//   println(factorial(10)) // Si el recursive deep es muy grande se da un StackOverflow

   def anotherFactorial(n: Int): BigInt = { // Factorial que no se desborda

     def factHelper(x: Int, accumulator: BigInt): BigInt = // Sometimes you need more than one accumulators
       if (x <= 1) accumulator
       else factHelper(x - 1, x * accumulator) // TAIL RECURSION = use recursive call as the LAST expression

     factHelper(n, 1)
   }

   println(anotherFactorial(20000))

   // WHEN YOU NEED LOOPS, USE TAIL_RECURSION.
}
