package org.template.v0

import org.scalatest._
import org.template.v0.Main

class MainTest extends FunSuite{
  test("test word count with input string"){
    assert(Main.WordCount("ScalaSandbox Test")==2)
  }
  test("Test Word count with empty string"){
    assert(Main.WordCount(str = null)==0)
  }
}
