package db

import com.knoldus.db.CompanyReadDto
import org.scalatest.flatspec.AnyFlatSpec

class ComapnyReadto extends AnyFlatSpec {

  val company = new CompanyReadDto()
  "Company details " should "be found for valid company name" in {
    val result = company.getCompanyByName("Knoldus")
    assert(!result.isEmpty)
  }

  "Company details " should "not be found for invalid company name" in {
    val result = company.getCompanyByName("name")
    assert(result.isEmpty)
  }

}