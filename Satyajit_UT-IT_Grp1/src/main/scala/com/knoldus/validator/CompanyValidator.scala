package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company

class CompanyValidator(companyRead: CompanyReadDto, validateEmail: EmailValidator) {

  def companyIsValid(company: Company): Boolean = {

    val emailValid = validateEmail.emailIdIsValid(company.emailId)

    val nameValid = companyRead.getCompanyByName(company.name)

    if (emailValid == true && !nameValid.isEmpty)
      true
    else
      false

  }

}