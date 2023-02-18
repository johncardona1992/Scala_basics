import scala.annotation.tailrec
object Recursion extends App {
  // Tail recursion
  def factorialNth(n: Int): BigInt = {
    //inform the compiler with @tailrec when a tail recursion occurs 
    @tailrec
    def tailFunction(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator else tailFunction(x - 1, x * accumulator)

    tailFunction(n, 1)
  }

  println(factorialNth(5))
}
