package com.learning.implicits.creatingimplicitconverter


/**
 *
 *
 * The following is the same as the previous step, the only difference is that we now define our implicit as a function.
 *
 * NOTE: Notice that in the call to combine, we are calling the method with two Ints.
 *       The difference is that we are using implicit val int2Dollar, which is a function instead of a method.
 */
import scala.language.implicitConversions

//Abstract Data Type of Various Currencies

object _2CreatingImplicitConverterFunction extends App {

  //Instead of a method, this time with a function
  implicit val int2Dollar: Int => Dollar = (i:Int) => Dollar(i)

  //Only Dollars Allowed
  def combine(x:Dollar, y:Dollar):Dollar = Dollar(x.value + y.value)

  //Calling combine with Int not Dollars but it works!
  println(combine(100, 100))
}