package com.learning.implicits.identifyingimplicits

/**
 *
 * Primitive Conversions
   Every "Primitive," or any type that extends from AnyVal, has an implicit wrapper associated with it.
   The wrapper names come prefixed with the word Rich. For example, RichInt, RichFloat, etc.
   These conversions happen automatically, without you even really considering it.

   Here is an example of the conversion from the [Predef source](https://github.com/scala/scala/blob/v2.13.2/src/library/scala/Predef.scala#L529):
   ```
      implicit def intWrapper(x: Int):
      runtime.RichInt = new runtime.RichInt(x)
   ```

  What is contained in these values? Let's look at an example of RichInt(https://github.com/scala/scala/blob/v2.13.2/src/library/scala/runtime/RichInt.scala).
 */
object _2PrimitiveConversions extends App {

  //max comes from RichInt
  println(10.max(3))

  //to is a method in RichInt, this is how a range is created
  (1 to 10).foreach(println)

  //toHexString is a method in RichInt
  println(30.toHexString)
}