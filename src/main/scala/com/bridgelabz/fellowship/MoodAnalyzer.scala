package com.bridgelabz.fellowship

class MoodAnalyzer (message: String) {

  object MoodAnalyzer {
    // method which checks message
    def analyzeMood(): String = {
      if (message.contains("Sad"))
        "SAD"
      else
        "HAPPY"
    }
  }
}
