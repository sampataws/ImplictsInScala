package com.learning.implicits.creatingimplicitvalue

/**
 *
 * Binding Services Implicitly:
   Now we can rewrite the previous step with an implicit.
   Notice that, by doing so, we do not have to set the ExecutionContext explicitly.
   Every time we have a method that requires an ExecutionContext, we use the executionContext that is bound implicitly.
   Compare and contrast the differences between this step and the previous step to get a deeper understanding of what's going on:
 */
object _6ImplicitlyBindingServices extends App {

  import scala.concurrent._
  import java.util.concurrent.Executors

  val executor = Executors.newFixedThreadPool(4) //Java
  implicit val executionContext: ExecutionContext =
    ExecutionContext.fromExecutor(executor)

  val future = Future.apply {
    println(s"Thread-name: ${Thread.currentThread().getName}")
    Thread.sleep(3000)
    50 + 100
  }

  future
    .map(x => x * 100)
    .foreach(a => println(a))

  //Let the future do it's job, System.exit required for KataCoda
  Thread.sleep(5000)
  System.exit(0)

}
