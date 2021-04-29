package com.learning.implicits.identifyingimplicits


case class A(tag:String, load:Int)

object A {
  val lexicographicalOrdering = Ordering.by { foo: A =>
    foo.tag
  }

  val loadOrdering = Ordering.by { foo: A =>
    foo.load
  }
}


