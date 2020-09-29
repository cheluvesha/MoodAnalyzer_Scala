package com.bridgelabz.fellowship

object TypeException extends Enumeration {
  type TypeException = Value

  val NullType: TypeException.Value =Value("it cant be null, Please enter proper message ")
  val EmptyType: TypeException.Value =Value("it cant be empty, Please enter proper message")
}