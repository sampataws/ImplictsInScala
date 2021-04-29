package com.learning.implicits.creatingimplicitconverter

sealed abstract class Currency
case class Dollar(value:Int) extends Currency
case class Yuan(value:Int) extends Currency
case class Euro(value:Int) extends Currency