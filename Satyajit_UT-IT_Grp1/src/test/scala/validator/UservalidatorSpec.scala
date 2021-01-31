package validator

import com.knoldus.db.{CompanyReadDto, UserReadTo}
import com.knoldus.models.User
import com.knoldus.request.UserImpl
import com.knoldus.validator.{EmailValidator, UserValidator}
import org.scalatest.flatspec.AnyFlatSpec

class UservalidatorSpec extends AnyFlatSpec {
  val companyinput = new CompanyReadDto
  val userinput = new UserReadTo
  val emailValid = new EmailValidator
  val userValid = new UserValidator(userinput, emailValid, companyinput)

  "User details" should "send be found for valid parameter" in {
    val user1: User = User("cust1", "lastName", 20, "satyajit.sahu@knoldus.com", "1234567890", "city1", "Knoldus")
    val result = userValid.userValidator(user1)
    assert(result == true)
  }

  "user details" should "send not be found for invalid parameter" in {
    val user1: User = User("cust1", "lastName", 20, "email", "1987654321", "city2", "Google")
    val result = userValid.userValidator(user1)
    assert(result == false)
  }
}
