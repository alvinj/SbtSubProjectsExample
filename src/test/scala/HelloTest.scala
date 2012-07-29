package com.alvinalexander.testproject

import org.scalatest.FunSuite
import com.alvinalexander.foo._
import com.alvinalexander.bar._ 

class HelloSuite extends FunSuite {
 
  test("the Foo name is set correctly") {
    val f = Foo("Foo")
    assert(f.name == "Foo")
  }
 
  test("the Bar name is set correctly") {
    val b = Bar("Bar")
    assert(b.name == "Bar")
  }

}

