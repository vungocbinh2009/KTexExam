package latex

import java.io.File

/**
 * This class allow user print exam solution.
 * [preamble]: Preamble in latex file
 * [header]: Text add before print answer list
 * [questionList]: List of question in this exam
 * [footer] Text add after print answer list
 */
class LatexExamSolution(val preamble: String, val header: String, val questionList:
List<LatexQuestion>, val footer: String) {

    /**
     * Export tex file to [fileDir]
     */
    fun exportTexFile(fileDir: String) {
        val content = generateTexString()
        File(fileDir).bufferedWriter().use {
            it.write(content)
        }
    }

    /**
     * Export pdf file from tex file to [fileDir]
     */
    fun exportPdfFile(fileDir: String) {
        exportTexFile(fileDir)
        Runtime.getRuntime().exec("pdflatex $fileDir")
    }

    /**
     * Generate tex code to export tex file
     */
    private fun generateTexString(): String {
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