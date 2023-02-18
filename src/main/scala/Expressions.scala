object Expressions extends App {
  val x = 1 + 2
  println(x)

  // instructions (doing) vs expressions (compute value)
  // If expression
  println(if (true) 5 else 3)

  // avoid imperative programing at all cost
  // never use for loops or while loops
  // instead use expressions
  // everything in scala is an expresion!
  var y = 2
  println(y)
  val aWeirdValue = (y = 5)
  // Unit value:
  println(aWeirdValue)

  // Code Blocks
  val myBlock = {
    val a = 100
    val b = 2
    println(a + b)
  }
  println(myBlock)
}
