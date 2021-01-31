package com.knoldus.validator

import com.knoldus.db.{CompanyReadDto, EmployeeReadto}
import com.knoldus.models.Employee

class EmployeeValidator(employeeRead: EmployeeReadto, validateEmail: EmailValidator) {

  def employeeIsValid(employee: Employee): Boolean = {

    val emailValid = validateEmail.emailIdIsValid(employee.emailId)
    val nameValid = employeeRead.getEmployeeByName(employee.firstName)
    if (emailValid == true && !nameValid.isEmpty)
      true
    else
      false
  }
}
