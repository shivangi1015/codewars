package com.developer

object mumbling extends App {

  /*
This time no story, no theory. The examples below show you how to write function accum:

Examples:

accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"
 */
  def accum(s: String) = {
    val r: List[String] = s.toList.zipWithIndex map {
      e => List.fill(e._2 + 1)(e._1.toLower).mkString("").capitalize
    }
    r.mkString("-")
  }

  val r = accum("aBcd")
  println(r)
}
