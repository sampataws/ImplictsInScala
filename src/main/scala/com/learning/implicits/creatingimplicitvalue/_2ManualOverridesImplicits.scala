package com.learning.implicits.creatingimplicitvalue

/**
 *
 * Manual Overrides
   We don't have to accept the implicit value; we can place something manually if we want to override the implicit value.
   Notice how in the following example, we are adding a second value of 110:
 */

object _2ManualOverridesImplicits extends App {

  implicit val rate: Int = 100

  def calcPayment(hours:Int)(implicit rate:Int) = hours * rate

  println(calcPayment(50)(110))
}