import builder.ExportType
import builder.LatexExamBuilder

/**
 * Exam of using this library.
 */
fun main() {
    LatexExamBuilder().createExam {
        exportType = ExportType.EXPORT_TEX
        fileName = "latexoutput/exam"
        questionTranslation = "Câu hỏi"
        withPreamble {

        }

        withHeader {
            useSimpleHeader("Exam 1", "Exam 1 subtitle")
        }

        withQuestions {

        }

        withFooter {

        }
    }
}