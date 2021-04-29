package com.learning.implicits.creatingimplicitconverter

/**
 *
 * Conversion Using a Method
   If we have an abstract data type of currencies and a method combine that only accepts Dollar,
   we can use a conversion to convert from a normal Int to a Dollar.

 NOTE: Notice that in the call to combine, we are calling the method with two Ints.
       The implicit def int2Dollar will perform the conversion since it's in scope.
 */

import scala.language.implicitConversions


object _1CreatingImplicitConverterMethod extends App {

  implicit def int2Dollar(i:Int):Dollar = Dollar(i)

  //Only Dollars Allowed
  def combine(x:Dollar, y:Dollar):Dollar = Dollar(x.value + y.value)

  //Calling combine with Int not Dollars but it works!
  println(combine(100, 100))

}