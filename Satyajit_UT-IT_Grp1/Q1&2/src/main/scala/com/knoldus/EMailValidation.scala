package com.knoldus

import scala.util.matching.Regex //To import the Regular expression package
import scala.io.StdIn._ //To import scala Standard input package for reading input from a user

object EMailValidation {
  //Function to get the input from main function and to check whether the mail is valid or not
  def validEmail(mail: String): Boolean = {
    val pattern = new Regex("^([a-zA-Z\\d\\.-]+)@([a-zA-Z\\d-]+)\\.(com|net|org)$") //To create the pattern according to the required mail
    val store = (pattern.findAllIn(mail)).mkString("") //To store the pattern of the mail
    if (store == mail) // To check whether the email entered is valid or not by comparing it with above created pattern
      true
    else {
      false
    }
  }

  def main(args: Array[String]): Unit = {
    println("Please enter your email id")
    val mail = readLine() //To get the email from the user
    if (validEmail(mail)) //Calling the validEmail function and print output according to that
    {
      println("Great! It is a valid email id")
    }
    else {
      println("Ohoo..., Sorry it is an invalid email, please check your email id and try again")
    }
  }
}