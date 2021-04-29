package com.learning.implicits.creatingimplicitvalue

/**
 * Implicit Conflicts Resolved
   The compiler already griped at compile time because there were two implicit bindings of the same type in the previous step.
   The following is the result of what happens when binding two values of the different types.

 * NOTE: Notice now that both rate and age are no longer Strings, but their types, Rate and Age respectively.
 * In the calcPayment method, we require a Rate type, and since Age has its type, there is no ambiguity.
 */
object _4ImplicitConflictResolved {

  case class Rate(value:Int)
  case class Age(value:Int)

  implicit val rate: Rate = Rate(100)
  implicit val age: Age = Age(40)

  def calcPayment(hours:Int)(implicit rate:Rate) =
    hours * rate.value

  println(calcPayment(50))

}
