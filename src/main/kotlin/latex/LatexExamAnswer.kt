package latex

/**
 * This class allow user print exam answer
 * [preamble]: Preamble in latex file
 * [header]: Text add before print answer list
 * [questionList]: List of question in this exam
 * [footer] Text add after print answer list
 */
class LatexExamAnswer(val preamble: String,val header: String, val questionList:
List<LatexQuestion>, val footer: String): LatexPaper {
    /**
     * Generate tex code to export tex file
     */
    override fun generateLatexString(): String {
        val answerString = printExamAnswer()
        val answerPreamble = getAnswerPreamble()
        return """
            |$preamble
            |$answerPreamble
            |\begin{document}
            |    $header
            |    
            |    $answerString
            |    
            |    $footer
            |\end{document}
        """.trimMargin()
    }

    /**
     * Generate exam answer latex code
     */
    private fun printExamAnswer(): String {
        val answerList = questionList.mapIndexed { index, latexQuestion ->
            val trueAnswer = latexQuestion.question.answerList.filter { it.isTrueAnswer }[0].answerKey
            """\textbf{${index + 1}}: $trueAnswer"""
        }.joinToString(separator = "\n\n")
        return """
            |\begin{multicols}{5}
            |    $answerList
            |\end{multicols}
        """.trimMargin()
    }

    /**
     * Add preamble need to print answer.
     */
    private fun getAnswerPreamble(): String {
        return """
            \usepackage{multicol}
        """.trimIndent()
    }
}