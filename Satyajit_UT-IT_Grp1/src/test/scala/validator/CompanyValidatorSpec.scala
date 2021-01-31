package validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company
import com.knoldus.request.CompanyImpl
import com.knoldus.validator.{CompanyValidator, EmailValidator}
import org.scalatest.flatspec.AnyFlatSpec

class CompanyValidatorSpec extends AnyFlatSpec {
  val companyRead = new CompanyReadDto
  val emailValidation = new EmailValidator
  val companyValidation = new CompanyValidator(companyRead, emailValidation)

  //Test case-1
  "Company details" should "send be found for Knoldus" in {
    val knoldus_company: Company = Company("Knoldus", "knoldus@knoldus.com", "Noida")
    val result = companyValidation.companyIsValid(knoldus_company)
    assert(result == true)
  }

  //Test case-2
  "Company details" should "send be found for Amazon" in {
    val amazon_company: Company = Company("Amazon", "amazon@amazon.com", "Hyderabad")
    val result = companyValidation.companyIsValid(amazon_company)
    assert(result == true)
  }

  //Test case-3
  "Company details" should "send be found for valid Microsoft parameter" in {
    val microsoft_company: Company = Company("Microsoft", "microsoft@microsoft.com", "Hyderabad")
    val result = companyValidation.companyIsValid(microsoft_company)
    assert(result == true)
  }

  //Test case-4
  "Company details" should "send be found for valid Google parameter" in {
    val google_company: Company = Company("Google", "google@google.com", "Hyderabad")
    val result = companyValidation.companyIsValid(google_company)
    assert(result == true)
  }

  //Test case-5
  "Company details" should "send not be found for invalid Knoldus parameter" in {
    val knoldus_company: Company = Company("Knoldus", "knoldus@knoldus.cm", "Noida")
    val result = companyValidation.companyIsValid(knoldus_company)
    assert(result == false)
  }

  //Test case-6
  "Company details" should "send not be found for invalid Microsoft parameter" in {
    val microsoft_company: Company = Company("Microsoft", "microsoft@microsoft.cm", "Noida")
    val result = companyValidation.companyIsValid(microsoft_company)
    assert(result == false)
  }

  //Test case-7
  "Company details" should "send not be found for invalid Google parameter" in {
    val google_company: Company = Company("Google", "google@google.om", "Noida")
    val result = companyValidation.companyIsValid(google_company)
    assert(result == false)
  }

  //Test case-8
  "Company details" should "send not be found for invalid Amazon parameter" in {
    val amazon_company: Company = Company("Amazon", "amazon@amazon.iy", "Hyderabad")
    val result = companyValidation.companyIsValid(amazon_company)
    assert(result == false)
  }

}