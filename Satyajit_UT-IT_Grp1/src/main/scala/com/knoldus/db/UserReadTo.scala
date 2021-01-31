package com.knoldus.db

import com.knoldus.models.User

import scala.collection.immutable.HashMap

class UserReadTo {

  //Add user details into database

  val user1: User = User("cust1", "lastName", 20, "email", "1234567890", "city1", "Knoldus")
  val user2: User = User("cust2", "lastName1", 20, "email1", "1987654321", "city2", "Google")

  val users: HashMap[String, User] = HashMap("cust1" -> user1, "cust2" -> user2)

  def getUserByName(name: String): Option[User] = users.get(name)
}
