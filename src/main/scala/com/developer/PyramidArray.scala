package com.developer

object PyramidArray {
  /*
  Write a function that when given a number >= 0, returns an Array of ascending length subarrays.

  pyramid(0) => [ ]
  pyramid(1) => [ [1] ]
  pyramid(2) => [ [1], [1, 1] ]
  pyramid(3) => [ [1], [1, 1], [1, 1, 1] ]
   */

  def pyramid(n: Int): List[List[Int]] = {
    def inner(n: Int, reslist: List[List[Int]]): List[List[Int]] = {
      n match {
        case 0 => reslist
        case _ => inner(n - 1, List(List.fill(n)(1)) ::: reslist)
      }
    }

    inner(n, List[List[Int]]())
  }
}
