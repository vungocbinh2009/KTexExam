package core

import kotlin.random.Random

/***
 * This class represent a question in an exam
 * [question]: Question
 * [answerList]: Answer choice list
 * [solution]: Solution for this question.
 */
data class Question(val question: String, val answerList: MutableList<Answer>, val solution:
String) {
    /**
     * This method allow user shuffle answer list
     */
    fun shuffleAnswer() {
        answerList.shuffle()
    }

    /**
     * This method allow user shuffle answer list with predefined seed
     */
    fun shuffleAnswer(seed: Long) {
        answerList.shuffle(Random(seed))
    }
}