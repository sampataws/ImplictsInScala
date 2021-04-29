##Scala Implicits: Creating an Implicit Wrapper (creatingimplicitwrapper)

A wrapper enhances a class with new methods. Let's say that an integer in Scala needs to have an ```isOdd``` and ```isEven``` method. That would be nice, but it doesn't. We can create a wrapper to aid in this.
In this scenario, we'll explore:

* Using an implicit method to enhance a class
* Using an implicit function to enhance a class
* Using an implicit class to enhance a class
* Using a generic type with an implicit wrapper

The advantage of this is to cut the cruft and allow your API callers to express themselves in the shortest amount of keystrokes possible without the need for multiple adapters.


##Scala Implicits: Using an Implicit Value(creatingimplicitwrapper)

An ```implicit``` is a keyword in Scala that has a lot of power. The keyword identifies a variable, method, or function as a construct that is available in case you need a particular type. In the following scenario, we'll investigate most of the uses of an ```implicit```.

In this scenario, we'll explore:

* Creating a simple value
* Manual overrides
* Implicit conflicts
* Resolving implicit conflicts
* Binding services manually
* Binding services implicitly
```implicit``` are core to everything in Scala, whether you are just using the language or using other libraries or frameworks, like Apache Spark.
  
##Scala Implicits: Creating an Implicit Converter

One of ```implicit's``` roles is to automatically convert one type to another using a method or a function. While there is certainly the potential for abuse, given the right context, we can use it where sensible. In this scenario, we look at a couple of ways to do that.

In this scenario, we'll explore:

* Conversion using a method
* Conversion using a function

Creating some conversions allows your users to call your API in a short, expressive manner.

##Scala Implicits: Looking up Implicit Bindings with Implicitly

```implicitly``` summons previously bound objects to types. One of its purposes is to summon those values inside of a method so as not to provide the option to your users. ```implicitly``` is compile-time and not runtime, so parameterized types come into play.

In this scenario, we'll take a look at:

* Using ```implicitly``` to summon bindings.
* Who said you could choose your ice cream? (When your code is exposed to user input.)
* You'll have the flavor of the month, and you'll like it! (Hiding your ```implicit``` behind a signature.)
* Implicits are compile-time, not runtime.

```implicitly``` is rarely used, but there are times when you'll need it.

##Scala Implicits: Identifying Implicits in Scala

```implicits``` are there for us to use, whatever the use case, but ```implicits``` are also already in use in the language. In this scenario, we discover meaningful ways in which ```implicits``` are in use:

* In the arrow (->) wrapper
* In rich primitive wrappers
* In BigInt conversions
* In BigInt wrappers
* In converting java to scala collections
* In ordering a List

Knowing some of the ways that Scala makes use of these wrappers enforces understanding how to use some of your own ```implicits```.