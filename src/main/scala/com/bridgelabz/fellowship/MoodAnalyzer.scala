package com.bridgelabz.fellowship

class MoodAnalyzerException(exceptionMsg:TypeException.Value ) extends Exception(exceptionMsg.toString){}
class MoodAnalyzer(var message: String) {
  def analyzeMood(): String = {
    try {
      if (message.length==0){
        throw new MoodAnalyzerException(TypeException.EmptyType)
      }
      if (message.contains("Sad"))
        "SAD"
      else
        "HAPPY"
    }
    catch {
      case nullPointerException: NullPointerException=>
        throw new MoodAnalyzerException(TypeException.NullType)
    }
  }
}