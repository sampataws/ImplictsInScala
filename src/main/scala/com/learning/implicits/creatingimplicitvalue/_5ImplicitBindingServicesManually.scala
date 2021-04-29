package com.learning.implicits.creatingimplicitvalue

/**
 * Binding Services Manually:
   Implicits are commonly used to bind services that require a service belonging to a type,
   and you don't particularly need to inject everywhere explicitly; in this case, let's discuss Future[+T].
   In Scala, Future cannot run without an ExecutionContext.
   The issue is that there are so many calls that require an ExecutionContext.
   In the following example, there is a Future[+T] running without an implicit. Notice how verbose it is:

 * NOTE: Notice that the answer (15000) appears three seconds later.
 */
object _5ImplicitBindingServicesManually extends App{

  import scala.concurrent._
  import java.util.concurrent.Executors

  val executor = Executors.newFixedThreadPool(4) //Java
  val executionContext: ExecutionContext =
    ExecutionContext.fromExecutor(executor)

  val future = Future.apply {
    println(s"Thread-name: ${Thread.currentThread().getName}")
    Thread.sleep(3000)
    50 + 100
  }(executionContext)

  future
    .map(x => x * 100)(executionContext)
    .foreach(a => println(a))(executionContext)

  //Let the future do it's job, System.exit required for KataCoda
  Thread.sleep(5000)
  System.exit(0)
}
