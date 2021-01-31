package com.knoldus.validator

import scala.util.matching.Regex

class EmailValidator {

  def emailIdIsValid(mail: String): Boolean = {
    val pattern = new Regex("^([a-zA-Z\\d\\.-]+)@([a-zA-Z\\d-]+)\\.(com|net|org)$")
    val x = (pattern.findAllIn(mail)).mkString("")
    if (x == mail)
      true
    else {
      false
    }
  }
}