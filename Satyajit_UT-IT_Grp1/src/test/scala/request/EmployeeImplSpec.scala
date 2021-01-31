package request

import com.knoldus.db._
import com.knoldus.models.{Company, Employee}
import com.knoldus.request.EmployeeImpl
import com.knoldus.validator.{CompanyValidator, EmailValidator, EmployeeValidator}
import org.scalatest.flatspec.AnyFlatSpec

class EmployeeImplSpec extends AnyFlatSpec {
  val employeeRead = new EmployeeReadto
  val emailValidation = new EmailValidator
  val employeeValidation = new EmployeeValidator(employeeRead, emailValidation)
  val employeeImp = new EmployeeImpl(employeeValidation)

  "Employee details" should "send be found for valid parameter" in {
    val employee_satyajit = Employee("Satyajit", "Sahu", 20, 15000, "Intern", "Knoldus", "satyajit.sahu@knoldus.com")
    val result = employeeImp.createEmployee(employee_satyajit)
    assert(!result.isEmpty)
  }

  "Company details" should "send not be found for invalid parameter" in {
    val employee_satyajit = Employee("Satyajit", "Sahu", 20, 15000, "Intern", "Knoldus", "satyajit.sahu@knolds.om")
    val result = employeeImp.createEmployee(employee_satyajit)
    assert(result.isEmpty)
  }
}