package com.learning.implicits.creatingimplicitwrapper

/**
 * Using an Implicit Function to Enhance a Class
   Here, we can do everything that we did in the last step,
   but instead of a method using def, we can use a function Int => IntWrapper.
   The results are the same.
 *
 * NOTE: Notice in the preceding code that we replaced the def with a function.
         val is assigned to an Int => IntWrapper, where it wraps the argument or the original reference.
 */


object UsingImplicitFunction extends App {

  class IntClassWrapper(x:Int) {
    def isOdd: Boolean = x % 2 != 0
    def isEven: Boolean = !isOdd
  }
  // Tell the compiler that I intend to perform a conversion
  import scala.language.implicitConversions

  // Define the conversion, for every Int wrap or adapt an IntWrapper
  // This is only applicable for this scope, inside the App
  // This is using a val and it is referencing a function

  implicit val int2IntWrapper: Int => IntClassWrapper =
    (x:Int) => new IntClassWrapper(x)

  println(10.isOdd)
  println(10.isEven)
}
