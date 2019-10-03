package com.developer

object BackwardPrime extends App {

  /*
  Backwards Read Primes are primes that when read backwards in base 10 (from right to left)
   are a different prime. (This rules out primes which are palindromes.)

Examples:
13 17 31 37 71 73 are Backwards Read Primes
   */

  def backwardsPrime(start: Long, nd: Long): String = {
    def isPrime(n: Long) = {
      n > 1 && !(2.toLong to n.toLong / 2).exists(n % _ == 0)
    }

    (start to nd)
      .filter(x => isPrime(x) && isPrime(x.toString.reverse.toInt))
      .filter(x => x.toString != x.toString.reverse)
      .map(x => x).mkString(",")
  }

  backwardsPrime(70000, 70245)
}
