package com.bridgelabz.fellowship

class MoodAnalyzer (message: String) {

  object MoodAnalyzer {
    // method which checks message
    def analyzeMood(): String = {
      try {
        if (message == null) {
          return "HAPPY"
        }
        if (message.contains("SAD"))
          "SAD"
        else
          "HAPPY"
      }
      catch {
        case nullPointerException: NullPointerException =>
          throw nullPointerException
      }
    }
  }
}
