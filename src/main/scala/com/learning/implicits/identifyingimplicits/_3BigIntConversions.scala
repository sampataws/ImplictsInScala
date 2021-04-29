package com.learning.implicits.identifyingimplicits

/**
 * BigInt Conversions
   BigInt is a Scala implementation of what java.lang.BigInteger is in Java, but with some distinctive features.
   We can create BigInt in much the same way as the Java equivalent, but where the similarities end is in how we can interact with it.
   With regard to implicits, BigInt converts any integer that you interact with it.
   In the following code, we don't need to convert 10 to a BigInt(10) before interacting with BigInt("2023949239324"), because this is automatic.
 */

object _3BigIntConversions extends App {
  println(BigInt("2023949239324") + 10)
}
