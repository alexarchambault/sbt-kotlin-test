package test

import example.Foo

object FooUsageFromScala extends App {
  val foo1 = Foo.Companion.bar(1)
  println(foo1)
  val foo2 = Foo.baz(2)
  println(foo2)
  val foo3 = Foo.Companion.baz(3)
  println(foo3)
}