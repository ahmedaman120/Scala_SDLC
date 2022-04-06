package org.template.v0

object Main {
  def WordCount(str:String): Int= {
    str match{
      case emp if isEmpty(str) => 0
      case str => str.split("\\W+").length
    }
  }

  def isEmpty(str:String) = str==null || str.trim.isEmpty

}
