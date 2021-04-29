package com.learning.implicits.createimplicitbindingsimplicitly

/**
 * implicitly can also differentiate parameterized types.

   In the following example, we create a List[String], where the square brackets contain the parameterized type.
   We can also create a List[Int]. In the JVM, both String and Int are erased and not known during runtime.
   The implicit resolution takes place at compile-time, so the String and the Int are still known and distinct.

   NOTE: Notice that implicitly[List[Double]] retrieves the right List when we ask for the first item from a zero-based List.
 */

object _4LookingUpImplicitlyWithBindings extends App {
  implicit val listOfString: List[String] = List("Foo", "Bar", "Baz")
  implicit val listOfDouble: List[Double] = List(1.0, 2.0, 3.0)

  val result = implicitly[List[Double]]
  println(result(1))
}