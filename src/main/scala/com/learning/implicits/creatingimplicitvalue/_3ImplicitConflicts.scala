package com.learning.implicits.creatingimplicitvalue

/**
 *
 * Implicit Conflicts
   The compiler gripes at compile time if there are two implicit bindings of the same type.
   It's worth noting that what Scala doing is compile-time tricks for implicit.
     One strategy is to wrap a value in a type to avoid conflict.
   The following is the result of what happens when you try to bind two values of the same type. Notice that both rate and age are Ints.

 * NOTE: We won't bother running this, however, because it will not compile.
 */
object _3ImplicitConflicts extends App{
  implicit val rate = 100
  implicit val age = 40

  def calcPayment(hours:Int)(implicit rate:Int) =
    hours * rate

//  calcPayment(50)

}
