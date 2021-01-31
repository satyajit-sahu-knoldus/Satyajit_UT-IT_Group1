package com.knoldus

import scala.io.StdIn._ //To import scala Standard input package for reading input from a user

object Fibonacci {
  def fibonacci(no: Int): Array[Int] = {
    var series: Array[Int] = new Array[Int](no)
    var temp = 0 //initialize temporary variable to store the previous series value to perform the operation

    //
    for (index <- 0 to no - 1; if (no > 0)) {
      if (index < 2) {
        series(index) = 1
        temp = series(index)
      } else {
        series(index) = series(index - 1) + temp //add the last two position values
        temp = series(index - 1)
      }
    }
    //return the series of numbers to the main function
    series
  }

  def main(args: Array[String]) {
    print("Enter the range to get fibonacci series : ")
    val range = readInt()
    var series = fibonacci(range) //Call the fibonacci function to get the series
    series.foreach(x => print(x + ", ")) //To print each number in series
  }
}
