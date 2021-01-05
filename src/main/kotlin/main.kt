import builder.ExportType
import builder.LatexExamBuilder

/**
 * Example of using this library.
 */
fun main() {
    LatexExamBuilder().createExam {
        exportType = ExportType.EXPORT_TEX
        fileName = "latexoutput/exam"
        questionTranslation = "Câu hỏi"
        withPreamble {
            setGeometry(2.0, 2.0, 2.0, 2.0)
            addMathPackage()
            addPackageWithOption("vietnam", "utf8")
            addPackage("tikz")
        }

        withHeader {
            useSimpleHeader("Exam 1", "Exam 1 subtitle")
            //useCustomHeader("???")
        }

        withQuestions {
            addQuestion(
                question = "Question 1",
                // answer automatically get A, B, C, D key in order.
                answer = listOf(
                    "1",
                    "2",
                    "3",
                    "4"
                ),
                // true answer here.
                trueAnswer = "A",
                answerColumn = 1
            )
        }

        withFooter {
            //setCustionFooter("???")
        }
    }
}