package com.learning.implicits.creatingimplicitwrapper


/**
 *
 * If we want to add functionality to a class that already exists in languages like Java,
 * you would use the decorator pattern or adapter pattern to add that functionality.
 * In Scala, you still use the adapter pattern, but the compiler fuses the adapter to the target automatically,
 * giving you the look and feel of a single class with your additional methods.

 Compile -> scalac -d target IntClassWrapper.scala
 Run -> scala -cp target com.learning.implicits.creatingimplicitwrapper.IntClassWrapper.scala
 */



object UsingImplicitMethod extends App{

  class IntClassWrapper(x:Int) {
    def isOdd: Boolean = x % 2 != 0
    def isEven: Boolean = !isOdd
  }
  // Tell the compiler that I intend to perform a conversion
  import scala.language.implicitConversions

  // Define the conversion, for every Int wrap or adapt an IntWrapper
  // This is only applicable for this scope, inside the App
  implicit def int2IntWrapper(x:Int):IntClassWrapper = new IntClassWrapper(x)

  println(10.isOdd)
  println(10.isEven)

}
