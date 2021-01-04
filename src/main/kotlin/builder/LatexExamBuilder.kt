package builder

import core.Answer
import core.Question
import latex.LatexExamAnswer
import latex.LatexExamPaper
import latex.LatexExamSolution
import latex.LatexQuestion
import kotlin.math.min

/**
 * This class add convenient method to create exam easier.
 */
class LatexExamBuilder {
    /**
     * Exam preamble.
     */
    private val preamble: Preamble = Preamble()

    /**
     * Exam Header.
     */
    private val header: Header = Header()

    /**
     * Exam questions.
     */
    private val questions: QuestionList = QuestionList()

    /**
     * Exam footer.
     */
    private val footer: Footer = Footer()

    /**
     * Exam file name.
     */
    var fileName: String = "exam"

    /**
     * Export type of this exam: You can export tex file or pdf file.
     */
    var exportType: ExportType = ExportType.EXPORT_PDF

    /**
     * Translate "Question" in your language.
     */
    var questionTranslation = "Question"
    set(value) {
        LatexQuestion.questionTranslation = value
        field = value
    }

    /**
     * This method allow user create an exam.
     */
    fun createExam(builder: LatexExamBuilder.() -> Unit) {
        builder(this)

        val preambleText = this.preamble.build()
        val headerText = this.header.build()
        val questionList = this.questions.build()
        val footerText = this.footer.build()

        val exam = LatexExamPaper(
            preamble = preambleText,
            header = headerText,
            questionList = questionList,
            footer = footerText
        )
        val answer = LatexExamAnswer(
            preamble = preambleText,
            header = headerText,
            questionList = questionList,
            footer = footerText
        )
        val solution = LatexExamSolution(
            preamble = preambleText,
            header = headerText,
            questionList = questionList,
            footer = footerText
        )

        if(exportType == ExportType.EXPORT_TEX) {
            exam.exportTexFile("$fileName.tex")
            answer.exportTexFile("${fileName}_answer.tex")
            solution.exportTexFile("${fileName}_solution.tex")
        }

        if(exportType == ExportType.EXPORT_PDF) {
            exam.exportPdfFile("$fileName.pdf")
            answer.exportPdfFile("${fileName}_answer.pdf")
            solution.exportPdfFile("${fileName}_solution.pdf")
        }
    }

    /**
     * This method allow add preamble config.
     */
    fun withPreamble(config: Preamble.() -> Unit) {
        config(preamble)
    }

    /**
     * This method allow add header config.
     */
    fun withHeader(config: Header.() -> Unit) {
        config(header)
    }

    /**
     * This method help user add question to exam.
     */
    fun withQuestions(config: QuestionList.() -> Unit) {
        config(questions)
    }

    /**
     * This method allow add footer config.
     */
    fun withFooter(config: Footer.() -> Unit) {
        config(footer)
    }
}

/**
 * Class help user generate preamble.
 */
class Preamble {
    /**
     * Exam font size.
     */
    private var fontSize: Int = 12
    /**
     * Các setup ở phần preamble.
     */
    private val configList = mutableListOf<String>()

    /**
     * Build preamble for exam.
     */
    fun build(): String {
        val packageListString = configList.joinToString(separator = "\n")
        return """
                |\documentclass[${fontSize}pt,a4paper]{article}
                |$packageListString
            """.trimMargin()
    }

    /**
     * Set geometry for exam.
     */
    fun setGeometry(left: Double = 2.0, right: Double = 2.0, top: Double = 2.0, bottom:
    Double = 2.0) {
        configList.add("""
                \usepackage[left=$left cm,right=$right cm,top=$top cm,bottom=$bottom cm]{geometry}
            """.trimIndent())
    }

    /**
     * Set exam font size.
     */
    fun setFontSize(size: Int) {
        fontSize = size
    }

    /**
     * Add math package to preamble.
     */
    fun addMathPackage() {
        configList.addAll(listOf(
            """\usepackage{amsmath}""",
            """\usepackage{amsfonts}""",
            """\usepackage{amssymb}""",
            """\usepackage{amsthm}"""
        ))
    }

    /**
     * Add latex package to exam.
     */
    fun addPackage(packageName: String) {
        configList.add(
            """\usepackage{$packageName}"""
        )
    }

    /**
     * Add latex package to exam with option
     */
    fun addPackageWithOption(packageName: String, option: String) {
        configList.add(
            """\usepackage[$option]{$packageName}"""
        )
    }

    /**
     * Add custom preamble.
     */
    fun addCustomPreamble(preambleString: String) {
        configList.add(preambleString)
    }
}

/**
 * Class help user add header to exam.
 */
class Header {
    /**
     * Header latex code.
     */
    private var headerString: String = ""

    /**
     * return header latex code.
     */
    fun build(): String {
        return headerString
    }

    /**
     * Create simple header for exam.
     */
    fun useSimpleHeader(title: String, subtitle: String) {
        headerString = """
                |\begin{center}
		        |    {\Large \textbf{$title}}
		        |
		        |    {\large $subtitle}
	            |\end{center}
            """.trimMargin()
    }

    /**
     * Add custom header for your exam.
     */
    fun useCustomHeader(code: String) {
        headerString = code
    }
}

/**
 * Class help user add question to exam.
 */
class QuestionList {
    /**
     * Exam question list
     */
    private val questionList = mutableListOf<LatexQuestion>()

    /**
     * Get exam question list.
     */
    fun build(): List<LatexQuestion> {
        return questionList
    }

    /**
     * Add question to exam.
     */
    fun addQuestion(question: String, answer: List<String>, trueAnswer: String, answerColumn:
    Int, solution: String = "") {
        val numberOfAnswer = min(answer.size, getCharacterList().size)
        val characterList = getCharacterList()
        val answerList = (0 until numberOfAnswer).map{ index ->
            Answer(characterList[index], answer[index], trueAnswer == characterList[index])
        }.toMutableList()
        val questionObj = Question(question, answerList, solution)
        val latexQuestion = LatexQuestion(questionObj, answerColumn)
        questionList.add(latexQuestion)
    }

    /**
     * Get character list to build question answer.
     */
    private fun getCharacterList(): List<String> {
        val charList = mutableListOf<String>()
        var c = 'A'
        while (c <= 'Z') {
            charList.add(c.toString())
            c++
        }
        return charList
    }
}

/**
 * Class help user add footer to your exam.
 */
class Footer {
    /**
     * latex code.
     */
    private var footerString: String = ""

    /**
     * get footer latex code.
     */
    fun build(): String {
        return footerString
    }

    /**
     * Set custom footer latex code.
     */
    fun setCustionFooter(code: String) {
        footerString = code
    }
}

/**
 * The enum class defines the possibilities for exam export
 */
enum class ExportType {
    EXPORT_PDF,
    EXPORT_TEX,
}