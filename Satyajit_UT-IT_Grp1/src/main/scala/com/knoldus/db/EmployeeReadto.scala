package com.knoldus.db

import com.knoldus.models.Employee

import scala.collection.immutable.HashMap

class EmployeeReadto {

  //

  val employeeSatyajit = Employee("Satyajit", "Sahu", 20, 15000, "Intern", "Knoldus", "satyajit.sahu@knoldus.com")
  val employeeSample = Employee("firstName", "lastName", 20, 15000, "Designation", "Company", "email@domain.com")
  val employees: HashMap[String, Employee] = HashMap("Satyajit" -> employeeSatyajit, "Sample" -> employeeSample)

  def getEmployeeByName(name: String): Option[Employee] = employees.get(name)
}
