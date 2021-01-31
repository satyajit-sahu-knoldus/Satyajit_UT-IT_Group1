package com.knoldus.db

import com.knoldus.models.Company

import scala.collection.immutable.HashMap

class CompanyReadDto {

  //Add the name of the company to the database
  val knoldus_company: Company = Company("Knoldus", "knoldus@knoldus.com", "Noida")
  val google_company: Company = Company("Google", "google@google.com", "Hyderabad")
  val microsoft_company: Company = Company("Microsoft", "microsoft@microsoft.com", "Hyderabad")
  val amazon_company: Company = Company("Amazon", "amazon@amazon.com", "Hyderabad")

  val companies: HashMap[String, Company] = HashMap("Knoldus" -> knoldus_company, "Google" -> google_company, "Microsoft" -> microsoft_company, "Amazon" -> amazon_company)

  def getCompanyByName(name: String): Option[Company] = companies.get(name)

}