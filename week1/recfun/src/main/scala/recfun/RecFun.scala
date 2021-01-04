package recfun

object RecFun {

  def main(args: Array[String]): Unit = {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(s"${pascal(col, row)} ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = (c, r) match {
    case (c, r) if c < 0 || r <  0  => throw new IllegalArgumentException
    case (c, r) if c > r            => throw new IndexOutOfBoundsException
    case (c, r) if c == 0 || c == r => 1
    case _                          => pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    @scala.annotation.tailrec
    def go(acc: Int, chars: List[Char]): Int = {
      chars match {
        case ::(head, tail) if head == '(' && acc >= 0 => go(acc + 1, tail)
        case ::(head, tail) if head == ')' && acc >= 0 => go(acc - 1, tail)
        case ::(_, tail)                               => go(acc, tail)
        case Nil                                       => acc
      }
    }
    if (go(0, chars) == 0) true else false
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    (money, coins) match {
      case (m, c) if m < 0 || c.isEmpty => 0
      case (m, _) if m == 0             => 1
      case (m, c)                       => countChange(m, c.tail) + countChange(m - c.head, c)
    }
  }
}
