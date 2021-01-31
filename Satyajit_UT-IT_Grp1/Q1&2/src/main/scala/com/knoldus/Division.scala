package com.knoldus

import scala.io.StdIn._ //To import scala Standard input package for reading input from a user

object Division {

  def main(args: Array[String]) {
    print("Enter the number you want to divide : ")
    val no1 = readInt() //To take the first input from the user
    print("Enter the number you want to divide with : ")
    val no2 = readInt() //To take the second input from the user
    println("The quotient of the above division is : " + divideNumbers(no1, no2))
  }

  //Function to get the numbers from the main function and to return the division of those numbers
  def divideNumbers(no1: Int, no2: Int) = {
    // try to divide the numbers if numbers are valid
    try {
      no1 / no2
    }
    catch {
      //If any exception occurs then print the that exception message as output
      case x: Exception =>
        println("The number is cannot be divided " + x.getMessage + " according to mathematical division rule")
        "Sorry it is not defined, please try with some other number"
    }
  }
}