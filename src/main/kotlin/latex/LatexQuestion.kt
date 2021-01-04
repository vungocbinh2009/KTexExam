package latex

import core.Question

/**
 * This class wrap [Question] class to print question in latex
 * [question]: Question content
 * [answerColumn]: number of column when print question's answer
 */
class LatexQuestion(val question: Question, private val answerColumn: Int) {
    /**
     * method generate latex code represent question.
     */
    fun printQuestion(): String {
        val tabularColumn = (1..answerColumn).joinToString(separator = " ") {
            val columnSize = String.format("%.2f", 1.0 / answerColumn)
            """S{m{$columnSize\linewidth}}"""
        }
        val answerString = question.answerList.mapIndexed { index, answer ->
            val separator = if ((index + 1) % answerColumn == 0) {
                "\\\\\n"
            } else {
                "& "
            }
            """\textbf{${answer.answerKey}}. ${answer.answer} $separator"""
        }.joinToString(separator = "\n")

        return """
            |\begin{question}
            |   ${question.question}
            |   
            |   \begin{tabular}{$tabularColumn}
            |       $answerString
            |   \end{tabular}
            |\end{question}
        """.trimMargin()
    }

    companion object {
        /**
         * Translation word "Question": use when print question
         */
        var questionTranslation = "Question"

        /**
         * Preamble needed to print question.
         */
        fun getPreamble(): String {
            return """
                |\newtheorem{question}{$questionTranslation}
                |\usepackage{array}
                |\usepackage{cellspace}
                |\setlength\cellspacetoplimit{5pt}
                |\setlength\cellspacebottomlimit{5pt}
            """.trimMargin()
        }
    }
}