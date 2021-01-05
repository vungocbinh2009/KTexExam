package latex

/**
 * This class allow user print exam
 * [preamble]: Preamble in latex file
 * [header]: Text add before print answer list
 * [questionList]: List of question in this exam
 * [footer] Text add after print answer list
 */
class LatexExamPaper(val preamble: String,val header: String, val questionList:
List<LatexQuestion>, val footer: String): LatexPaper {
    /**
     * Generate tex code to export tex file
     */
    override fun generateLatexString(): String {
        val examString = printquestionList()
        val questionPreamble = LatexQuestion.getPreamble()
        return """
            |$preamble
            |$questionPreamble
            |\begin{document}
            |    $header
            |    
            |    $examString
            |    
            |    $footer
            |\end{document}
        """.trimMargin()
    }

    /**
     * Generate latex code from question list
     */
    private fun printquestionList(): String {
        val questionString = questionList.joinToString(separator = "\n") {
            it.printQuestion()
        }
        return """
            $questionString
        """.trimIndent()
    }
}