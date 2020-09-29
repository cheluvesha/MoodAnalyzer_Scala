package com.fellowship.moodanalyzer
import org.scalatest.FunSuite
import com.bridgelabz.fellowship.MoodAnalyzer

class MoodAnalyzerTest extends FunSuite {

  test("givenMessageWhenSadShouldReturnSad") {
    val moodAnalyzer = new MoodAnalyzer("I am in Sad Mood")
    assert(moodAnalyzer.MoodAnalyzer.analyzeMood() === "SAD")
  }
  test("givenMessageWhenHappyShouldReturnHappy") {
    val moodAnalyzer = new MoodAnalyzer("I am in Happy Mood")
    assert(moodAnalyzer.MoodAnalyzer.analyzeMood() === "HAPPY")
  }
  test("givenAnyMessageShouldReturnHappy") {
    val moodAnalyzer = new MoodAnalyzer("I am in Any Mood")
    assert(moodAnalyzer.MoodAnalyzer.analyzeMood() === "HAPPY")
  }
  test("givenNullMessageShouldReturnHappy") {
    val moodAnalyzer = new MoodAnalyzer(null)
    assert(moodAnalyzer.MoodAnalyzer.analyzeMood() === "HAPPY")
  }
}

