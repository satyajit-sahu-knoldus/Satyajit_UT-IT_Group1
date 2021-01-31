package db

import com.knoldus.db.EmployeeReadto
import org.scalatest.flatspec.AnyFlatSpec

class EmployeeReadtoSpec extends AnyFlatSpec {
  val employee = new EmployeeReadto

  "Employee details " should "not be found for invalid employee name" in {
    val result = employee.getEmployeeByName("name")
    assert(result.isEmpty)
  }
}