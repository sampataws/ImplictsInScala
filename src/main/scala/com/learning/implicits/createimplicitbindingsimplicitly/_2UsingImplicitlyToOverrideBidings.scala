package com.learning.implicits.createimplicitbindingsimplicitly

/**
 * Who Said You Can Choose Your Own Ice Cream?
   There is nothing wrong with the previous step, unless you don't want anyone overriding the flavor of the month and making their own choice.
   If you are a "My Way or the Highway" kind of ice cream vendor, then the previous step is not for you!
   The following code demonstrates how easy it for your customers to plugin their own favorite ice cream.
 */



object _2UsingImplicitlyToOverrideBidings extends App {
  //Flavor of the month
  implicit val flavorOfTheMonth: IceCream = IceCream("Rainbow Sherbet")

  def orderIceCream(num:Int)(implicit flavorOfTheMonth:IceCream) = {
    Scoops(num, flavorOfTheMonth)
  }
  println(orderIceCream(4)(IceCream("Rocky Road")))
}