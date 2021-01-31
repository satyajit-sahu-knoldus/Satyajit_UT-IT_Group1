package request

import com.knoldus.db.{CompanyReadDto, EmployeeReadto, UserReadTo}
import com.knoldus.models.{Employee, User}
import com.knoldus.request.{EmployeeImpl, UserImpl}
import com.knoldus.validator.{EmailValidator, EmployeeValidator, UserValidator}
import org.scalatest.flatspec.AnyFlatSpec

class UserImplSpec extends AnyFlatSpec {

  val companyRead = new CompanyReadDto
  val userRead = new UserReadTo
  val emailValidator = new EmailValidator
  val userValid = new UserValidator(userRead, emailValidator, companyRead)
  val userImp = new UserImpl(userValid)

  "User details" should "send be found for valid parameter" in {
    val cust1: User = User("cust1", "lastName", 20, "satyajit.sahu@knoldus.com", "1234567890", "city1", "Knoldus")
    val result = userImp.createUser(cust1)
    println("\n\nResult :  " + result + "\n\n")
    assert(!result.isEmpty)
  }

  "user details" should "send not be found for invalid parameter" in {
    val cust1: User = User("cust1", "lastName", 20, "email", "1987654321", "city2", "Google")
    val result = userImp.createUser(cust1)
    println("\n\n" + result + "\n\n")
    assert(result.isEmpty)
  }
}
