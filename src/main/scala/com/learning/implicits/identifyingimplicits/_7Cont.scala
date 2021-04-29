package com.learning.implicits.identifyingimplicits

object Main extends App {
  implicit val ord = A.lexicographicalOrdering
  val l = List(A("words",1), A("article",2), A("lines",3)).sorted
  l.max.load
  // List(A(article,2), A(lines,3), A(words,1))

  // now in some other scope
  // implicit val ord = A.loadOrdering
  // val l = List(A("words",1), A("article",2), A("lines",3)).sorted
  // List(A(words,1), A(article,2), A(lines,3))
}
