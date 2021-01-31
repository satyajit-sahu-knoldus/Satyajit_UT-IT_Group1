package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class EMailValidationSpec extends AnyFlatSpec {
  //Test case-1
  "send success" should " email has alphanumeric username in lowercase or uppercase" in {
    val result: Boolean = EMailValidation.validEmail("satyajit.sahu@knoldus.com")
    assert(result == true)
  }
  //Test case-2
  "send failed" should " for invalid email" in {
    val result: Boolean = EMailValidation.validEmail("testEmail@email.test")
    assert(result == false)
  }
}