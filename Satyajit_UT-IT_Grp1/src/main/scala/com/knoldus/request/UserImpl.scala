package com.knoldus.request

import com.knoldus.models.User
import com.knoldus.validator.UserValidator

class UserImpl(userValidator: UserValidator) {
  def createUser(user: User): Option[String] = {
    println(user+"***-------------------***")
    if (userValidator.userValidator(user))
      Option(user.email)
    else None
  }
}
