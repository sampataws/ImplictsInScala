package com.learning.implicits.creatingimplicitwrapper

/**
 * Using a Generic Type with an Implicit Wrapper
   What if we want to apply a particular wrapper to every object in Scala within a particular scope?
   An implicit wrapper is where a parameterized type shines. In the following example, we use [A] to represent any type.

 * NOTE: Notice in the preceding code that we are not wrapping anything in particular, only the generic type A.
         What this gives us is the ability to call the exclaim method on just about any value.
 */
object UsingGenericTypeImplicitClass extends App {
  implicit final class ExclaimClass[A](private val v:A) {
    def exclaim:String = v.toString + "!"
  }

  println(10.exclaim)
  println("Hello".exclaim)
  println(List(1,2,3).exclaim)
}