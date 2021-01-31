package validator

import com.knoldus.db.EmployeeReadto
import com.knoldus.models.Employee
import com.knoldus.request.EmployeeImpl
import com.knoldus.validator.{EmailValidator, EmployeeValidator}
import org.scalatest.flatspec.AnyFlatSpec

class EmployeeValidatorSpec extends AnyFlatSpec {

  val employeeInput = new EmployeeReadto
  val emailValidation = new EmailValidator
  val employeeValidation = new EmployeeValidator(employeeInput, emailValidation)
  val employeeImp = new EmployeeImpl(employeeValidation)

  //Test case-1

  "Employee details" should "send be found for valid Employee" in {
    val employee_satyajit = Employee("Satyajit", "Sahu", 20, 15000, "Intern", "Knoldus", "satyajit.sahu@knoldus.com")
    val result = employeeValidation.employeeIsValid(employee_satyajit)
    assert(result == true)
  }

  // Test case-2

  "Employee details" should "send be found for invalid Employee" in {
    val employee_satyajit = Employee("Satyajit", "Sahu", 20, 15000, "Intern", "Knoldus", "satyajit.sahu@knoldus.cm")
    val result = employeeValidation.employeeIsValid(employee_satyajit)
    assert(result == false)
  }

}