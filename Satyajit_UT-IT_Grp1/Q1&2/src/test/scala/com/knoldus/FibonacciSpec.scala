package com.knoldus

import com.knoldus.Fibonacci
import org.scalatest.flatspec.AnyFlatSpec

class FibonacciSpec extends AnyFlatSpec {

  //Test case-1
  "Fibonacci" should "send success for series upto 6" in {
    val result: Array[Int] = Array(1, 1, 2, 3, 5, 8)
    val res = Fibonacci.fibonacci(6)
    assert(result.sameElements(res))
  }
  //Test case-2
  "Fibonacci" should "send success for series upto 17" in {
    val result: Array[Int] = Array(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597)
    val res = Fibonacci.fibonacci(17)
    assert(result.sameElements(res))
  }

  //Test case-4
  "Fibonacci" should "send failed for wrong wrong input" in {
    //If negative no is given as input then show the exception message
    val caught =
      intercept[NegativeArraySizeException] {
        Fibonacci.fibonacci(-1)
      }
    assert(caught.getMessage.indexOf("-1") != -1)
  }
}