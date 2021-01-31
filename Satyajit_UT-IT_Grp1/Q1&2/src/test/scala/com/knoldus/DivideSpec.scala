package com.knoldus

import com.knoldus.Division
import org.scalatest.flatspec.AnyFlatSpec

class DivideSpec extends AnyFlatSpec {

  //Test case-1
  "send failed" should "not divide by zero" in {
    val result = Division.divideNumbers(1, 0)
    assert(result == "Sorry it is not defined, please try with some other number")
  }

  //Test case-2
  "send success" should "divide 1024/8" in {
    val result = Division.divideNumbers(1024, 8)
    assert(result == 128)
  }

  //Test case-3
  "send success" should "divide 1048576/8" in {
    val result = Division.divideNumbers(1048576, 8)
    assert(result == 131072)
  }

  //Test case-4
  "send success" should "1048/4" in {
    val result = Division.divideNumbers(1048, 4)
    assert(result == 262)
  }

  //Test case-5
  "send success" should "100/10" in {
    val result = Division.divideNumbers(100, 10)
    assert(result == 10)
  }
}
