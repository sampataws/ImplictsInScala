package com.learning.implicits.createimplicitbindingsimplicitly

/**
 * You'll Have the Flavor of the Month, and You'll Like It!
   implicitly summons a type that has bound implicitly within the context or any parent context.

   In the following example, we bind an IceCream flavor as the flavor of the month.
   This time, we are not giving the caller of our method orderIceCream an opportunity the set the flavor of the month.
   Not in this ice cream shop. The implicitly is hidden behind the signature.
 */


object _3LookingUpImplicitlyWithBindings extends App {
  //Flavor of the month
  implicit val flavorOfTheMonth: IceCream = IceCream("Rainbow Sherbet")

  def orderIceCream(num:Int) = {
    Scoops(num, implicitly[IceCream])
  }
  println(orderIceCream(4))
}