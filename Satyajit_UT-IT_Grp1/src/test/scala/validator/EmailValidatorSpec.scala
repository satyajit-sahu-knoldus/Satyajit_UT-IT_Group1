package validator

import com.knoldus.validator.EmailValidator
import org.scalatest.flatspec.AnyFlatSpec

class EmailValidatorSpec extends AnyFlatSpec {

  //Test case-1
  "email id" should "send success for satyajit.sahu@knoldus.com" in {
    val email = (new EmailValidator).emailIdIsValid("satyajit.sahu@knoldus.com")
    assert(email == true)
  }

  //Test case-2
  "email id" should "send failure for satyajit.sahu@gmail.com" in {
    val email = (new EmailValidator).emailIdIsValid("satyajit.sahu@gmail.om")
    assert(email == false)
  }

  //Test case-3
  "email id" should "send failure for @satyajit.sahu@gmail.com" in {
    val email = (new EmailValidator).emailIdIsValid("@satyajit.sahu@gmail.com")
    assert(email == false)
  }

  //Test case-4
  "email id" should "send success for sahu@yahoo.org" in {
    val email = (new EmailValidator).emailIdIsValid("satyajit.sahu@yahoo.org")
    assert(email == true)
  }

  //Test case-5
  "email id" should "send success for sahu@gmail.net" in {
    val email = (new EmailValidator).emailIdIsValid("sahu@gmail.net")
    assert(email == true)
  }
}