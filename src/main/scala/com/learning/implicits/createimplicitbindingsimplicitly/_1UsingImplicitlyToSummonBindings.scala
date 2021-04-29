package com.learning.implicits.createimplicitbindingsimplicitly

/**
 *
 * Let's start from what we learned in the previous scenario, implicitly binding a type: in this case, an IceCream.
   We can then bring in the IceCream into an implicit method parameter.

 * NOTE: Notice that the ice cream flavor is Rainbow Sherbet. But note that this has the potential to be overridden.
 */


object _1UsingImplicitlyToSummonBindings extends App {
  //Flavor of the month
  implicit val flavorOfTheMonth: IceCream = IceCream("Rainbow Sherbet")

  def orderIceCream(num:Int)(implicit flavorOfTheMonth:IceCream):Scoops = {
    Scoops(num, flavorOfTheMonth)
  }
  println(orderIceCream(4))
}