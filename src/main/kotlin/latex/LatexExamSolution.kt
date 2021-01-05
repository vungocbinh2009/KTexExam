package latex

/**
 * This class allow user print exam solution.
 * [preamble]: Preamble in latex file
 * [header]: Text add before print answer list
 * [questionList]: List of question in this exam
 * [footer] Text add after print answer list
 */
class LatexExamSolution(val preamble: String, val header: String, val questionList:
List<LatexQuestion>, val footer: String): LatexPaper {
    /**
     * Generate tex code to export tex file
     */
    override fun generateLatexString(): String {
        val answerString = printExamSolution()
        val questionPreamble = LatexQuestion.getPreamble()
        return """
            |$preamble
            |$questionPreamble
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
     * Generate latex code present exam solution.
     */
    private fun printExamSolution(): String {
        val questionString = questionList.joinToString(separator = "\n") {
            """
                |${it.printQuestion()}
                |
                |${it.question.solution}
            """.trimMargin()
        }
        return """
            |$questionString
        """.trimMargin()
    }
}