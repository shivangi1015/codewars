package com.developer

object SumConsecutives extends App {

  /*
  You are given a list/array which contains only integers (positive and negative).
   Your job is to sum only the numbers that are the same and consecutive.
    The result should be one list.
   */
  def sumConsecutives(xs: List[Int]): List[Int] = {
    def inner(rem: List[Int], res: List[Int]): List[Int] = {
      rem match {
        case Nil => res
        case h :: Nil => inner(rem.dropWhile(_ == h), res :+ rem.takeWhile(_ == h).sum)
        case h :: t if h == t.head => inner(rem.dropWhile(_ == h), res :+ rem.takeWhile(_ == h).sum)
        case h :: t => inner(t, res :+ h)
      }
    }

    inner(xs, Nil)
  }

  println(sumConsecutives(List(3, 3, 3, 3, 1)))
}
