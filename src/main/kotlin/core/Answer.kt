package core

/**
 * This class represents a chosen option in the question
 * [answerKey]: Character represents answer in the exam
 * [answer]: Answer
 * [isTrueAnswer]: The boolean variable represents the answer is correct or not
 */
data class Answer(val answerKey: String, val answer: String, val isTrueAnswer: Boolean)