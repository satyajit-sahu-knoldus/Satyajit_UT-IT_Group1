package db

import com.knoldus.db.UserReadTo
import org.scalatest.flatspec.AnyFlatSpec

class UserReadToTest extends AnyFlatSpec {
  val user = new UserReadTo
  "User details " should "be found for valid name" in {
    val result = user.getUserByName("cust1")
    assert(!result.isEmpty)
  }

  "User details " should " not be found for invalid name" in {
    val result = user.getUserByName("customer")
    assert(result.isEmpty)
  }
}