package com.learning.implicits.creatingimplicitwrapper

/**
 *
 * Using an Implicit Class to Enhance a Class
   Why use a method or a function when we can just put an implicit in front of the class definition and get the same thing?
   Before we do that, however, here are some rules to keep in mind:

   1. They can only be declared inside of an object/trait/class
   2. They can only take one parameter in the constructor
   3. There can not be any colliding method name in the outer scope

 * NOTE: Notice in the preceding code that we don't have a method or function, but the enhancement still works.
         That is because of the implicit in front of the class definition.
 */


object UsingImplicitClass extends App {
  //Notice that we have an implicit keyword in front of class

  //Also notice I cannot violate rule number 1, I must put it
  //in a trait, object, or class

  implicit class IntClassWrapper(x:Int) {
    def isOdd: Boolean = x % 2 != 0
    def isEven: Boolean = !isOdd
  }

  // Tell the compiler that I intend to perform a conversion
  import scala.language.implicitConversions

  // No methods or function definitions required

  println(10.isOdd)
  println(10.isEven)
}