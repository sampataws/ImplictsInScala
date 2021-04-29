package com.learning.implicits.identifyingimplicits

/**
 * The Arrow Wrapper
   "Syntactic sugar" is a term that gets used a lot. When someone says "syntactic sugar," it usually means that the language designers made a special consideration in the structure of language or bent their rules to allow someone to do something. The -> is not syntactic sugar; it is the adapter pattern—simplified by the compiler.

    One of the well known implicit wrappers that are already in use currently in Scala is the -> wrapper.
   The -> wrapper takes the left-hand side and the right-hand side of the arrow, whatever type(s) they may be, and turns them into a Tuple2. These definitions reside in an object called Predef(https://github.com/scala/scala/blob/v2.13.2/src/library/scala/Predef.scala)
    which is automatically imported into any Scala file.

    It is used most commonly in creating a Map[K,V], since the apply factory method requires a Tuple2[A,B]* repeated parameter.
 */
object _1ArrowWrapper extends App {

  // -> creates a Tuple2
  val m = 1 -> "One"
  println(m)

  // Calling Map.apply with repeated parameters of Tuple2
  val map = Map(1 -> "One", 2 -> "Two", 3 -> "Three")
  println(map)
}