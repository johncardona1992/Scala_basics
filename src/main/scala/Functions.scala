object Functions extends App {
  def myFunction(a: String, b: Int): String = { a + " " + b }
  println(myFunction("hello", 3))

  // use Recursion when loops are needed
  def forLoop(name: String, loops: Int): String = {
    if (loops == 1) name else name + forLoop(name, loops - 1)
  }
  println(forLoop("Hello!", 3))

  // side effects
  def aFunctionWithSideEffects(name: String): Unit = println(name)
  aFunctionWithSideEffects("Side effects!")
}
