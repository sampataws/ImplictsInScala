package com.learning.implicits.creatingimplicitvalue

/**
 * Creating a Simple Value
   implicits are like a Map[Class[A], A] where A is an object.
   It is tied into a scope, and it is there when you need it; hence it is implicit.
   implicits provide a lot of great techniques that we can use in Scala.

   You can see implicits applied per scope in the following example,
   where we begin with an implicit value and call it from inside a method which uses a multiple parameter list in which one group would accept
   the value as a parameter, and the other would receive the implicit value.
 */

object _1CreatingImplicitValue extends App {

  implicit val rate: Int = 100

  def calcPayment(hours:Int)(implicit n:Int) = hours * n

  println(calcPayment(30))

}