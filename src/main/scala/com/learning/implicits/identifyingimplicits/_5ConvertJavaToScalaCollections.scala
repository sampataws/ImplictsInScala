package com.learning.implicits.identifyingimplicits

/**
 * Converting Java to Scala Collections
  We need to call Java often, but Java's collections may not be immutable, which is a Scala standard.
  Java's collections also don't have quite the list of methods and functions that we love, so conversions are necessary.
  To do so, import scala.collection.JavaConverters._, and don't forget the underscore at the end.
  The underscore ensures that all implicits that are bound in the JavaConverters object are available.

  The following example uses Java's java.time API to get all the time zones in the world.
  We then call a decorator provided by JavaConverters named asScala to convert the Java Collection into a Scala Collection.
  Once we have our Scala collection, we use our functional programming prowess to find all the time zones in "America."

 * NOTE: For newer versions of Scala, this has been replaced by CollectionConverters(https://www.scala-lang.org/api/current/scala/jdk/CollectionConverters$.html).
 */

object _5ConvertJavaToScalaCollections extends App {
  import scala.collection.JavaConverters._
  import java.time._

  println(ZoneId.getAvailableZoneIds
    .asScala
    .toSet
    .filter(s => s.startsWith("America"))
    .map(s => s.split("/").last)
    .toList
    .sorted)
}