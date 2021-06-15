# KTexExam
A Kotlin binding of pytexexam with better DSL and more features

## Installation
```shell
implementation 'io.github.vungocbinh2009:ktexexam:0.3'
```
(For other build tool: https://search.maven.org/artifact/io.github.vungocbinh2009/ktexexam/0.3/jar)

## How to use
```kotlin
import builder.ExportType
import builder.LatexExamBuilder

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
```

## Documentation
If you want to see all the functions included in this library, you can find 
it [here](build/dokka)

## Note.
If you use IntelliJ IDEA, you can enable language injection to get Latex support 
inside Kotlin script
1. Install TeXiFy IDEA.
2. Go to Settings -> Editor -> Language Injection and add new rule:
    - Language ID: Latex (.tex) sources files
    - Places patterns: + kotlinFunction().definedInClass("LatexExamBuilder")
3. Enable it!. Now you get Latex syntax highlighting inside all method in 
   class LatexExamBuilder. Yayyy!

(You can also add other pattern, using method in this folder: https://github.
com/JetBrains/intellij-community/tree/master/java/java-psi-api/src/com/intellij/patterns)
## Contribution.
Contribution are welcome. Create a pull request.
## Buy me a coffee.
If you find this project useful, you can buy me coffee through Flattr [![Flattr this
git
repo](http://api.flattr.com/button/flattr-badge-large.png)](https://flattr.com/@vungocbinh)

## License
Apache License, Version 2.0
