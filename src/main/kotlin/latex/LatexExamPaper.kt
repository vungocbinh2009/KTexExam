package latex

import java.io.File

/**
 * This class allow user print exam
 * [preamble]: Preamble in latex file
 * [header]: Text add before print answer list
 * [questionList]: List of question in this exam
 * [footer] Text add after print answer list
 */
class LatexExamPaper(val preamble: String,val header: String, val questionList:
List<LatexQuestion>, val footer: String) {
    /**
     * Generate tex code to export tex file
     */
    private fun generateTexString(): String {
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
     * Export pdf file from tex file to [fileDir]
     */
    fun exportPdfFile(fileDir: String) {
        exportTexFile(fileDir)
        Runtime.getRuntime().exec("pdflatex $fileDir")
    }

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