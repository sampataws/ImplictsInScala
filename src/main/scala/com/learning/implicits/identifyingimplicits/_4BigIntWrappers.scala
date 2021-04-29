package com.learning.implicits.identifyingimplicits


/**
 *
 * BigInt Wrappers
   BigInt also has a wrapper that adds [functionality](https://www.scala-lang.org/api/current/scala/math/BigInt.html).
   We saw in the previous step that there is a method +, which adds two BigInts.
   If you look at the API,
   BigInt is merely a wrapper around java.lang.BigInteger that has addition, subtraction, power, max, min, to, and until for large ranges.
 */

object _4BigIntWrappers extends App {
  println(BigInt("2023949239324") + 10)
  println(BigInt("2023949239324") - 10)
  println(BigInt("2023949239324").pow(3))

  //Using a BigInt range
  BigInt("3023020233") to BigInt("3023020239") foreach (println)
}