//[KTexExam](../../../index.md)/[builder](../index.md)/[LatexExamBuilder](index.md)



# LatexExamBuilder  
 [jvm] public final class [LatexExamBuilder](index.md)

This class add convenient method to create exam easier.

   


## Constructors  
  
| | |
|---|---|
| <a name="builder/LatexExamBuilder/LatexExamBuilder/#/PointingToDeclaration/"></a>[LatexExamBuilder](-latex-exam-builder.md)| <a name="builder/LatexExamBuilder/LatexExamBuilder/#/PointingToDeclaration/"></a> [jvm] [LatexExamBuilder](index.md)[LatexExamBuilder](-latex-exam-builder.md)()  <br>   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="builder/LatexExamBuilder/createExam/#kotlin.Function1[builder.LatexExamBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[createExam](create-exam.md)| <a name="builder/LatexExamBuilder/createExam/#kotlin.Function1[builder.LatexExamBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[createExam](create-exam.md)(Function1<[LatexExamBuilder](index.md), [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>builder)  <br>  <br>More info  <br>This method allow user create an exam.  <br><br><br>|
| <a name="builder/LatexExamBuilder/getExportType/#/PointingToDeclaration/"></a>[getExportType](get-export-type.md)| <a name="builder/LatexExamBuilder/getExportType/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>final [ExportType](../-export-type/index.md)[getExportType](get-export-type.md)()  <br>  <br>More info  <br>Export type of this exam: You can export tex file or pdf file.  <br><br><br>|
| <a name="builder/LatexExamBuilder/getFileName/#/PointingToDeclaration/"></a>[getFileName](get-file-name.md)| <a name="builder/LatexExamBuilder/getFileName/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>final [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)[getFileName](get-file-name.md)()  <br>  <br>More info  <br>Exam file name.  <br><br><br>|
| <a name="builder/LatexExamBuilder/getQuestionTranslation/#/PointingToDeclaration/"></a>[getQuestionTranslation](get-question-translation.md)| <a name="builder/LatexExamBuilder/getQuestionTranslation/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>final [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)[getQuestionTranslation](get-question-translation.md)()  <br>  <br>More info  <br>Translate "Question" in your language.  <br><br><br>|
| <a name="builder/LatexExamBuilder/setExportType/#builder.ExportType/PointingToDeclaration/"></a>[setExportType](set-export-type.md)| <a name="builder/LatexExamBuilder/setExportType/#builder.ExportType/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[setExportType](set-export-type.md)([ExportType](../-export-type/index.md)exportType)  <br>  <br>More info  <br>Export type of this exam: You can export tex file or pdf file.  <br><br><br>|
| <a name="builder/LatexExamBuilder/setFileName/#kotlin.String/PointingToDeclaration/"></a>[setFileName](set-file-name.md)| <a name="builder/LatexExamBuilder/setFileName/#kotlin.String/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[setFileName](set-file-name.md)([String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)fileName)  <br>  <br>More info  <br>Exam file name.  <br><br><br>|
| <a name="builder/LatexExamBuilder/setQuestionTranslation/#kotlin.String/PointingToDeclaration/"></a>[setQuestionTranslation](set-question-translation.md)| <a name="builder/LatexExamBuilder/setQuestionTranslation/#kotlin.String/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[setQuestionTranslation](set-question-translation.md)([String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)questionTranslation)  <br>  <br><br><br>|
| <a name="builder/LatexExamBuilder/withFooter/#kotlin.Function1[builder.Footer,kotlin.Unit]/PointingToDeclaration/"></a>[withFooter](with-footer.md)| <a name="builder/LatexExamBuilder/withFooter/#kotlin.Function1[builder.Footer,kotlin.Unit]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[withFooter](with-footer.md)(Function1<[Footer](../-footer/index.md), [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>config)  <br>  <br>More info  <br>This method allow add footer config.  <br><br><br>|
| <a name="builder/LatexExamBuilder/withHeader/#kotlin.Function1[builder.Header,kotlin.Unit]/PointingToDeclaration/"></a>[withHeader](with-header.md)| <a name="builder/LatexExamBuilder/withHeader/#kotlin.Function1[builder.Header,kotlin.Unit]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[withHeader](with-header.md)(Function1<[Header](../-header/index.md), [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>config)  <br>  <br>More info  <br>This method allow add header config.  <br><br><br>|
| <a name="builder/LatexExamBuilder/withPreamble/#kotlin.Function1[builder.Preamble,kotlin.Unit]/PointingToDeclaration/"></a>[withPreamble](with-preamble.md)| <a name="builder/LatexExamBuilder/withPreamble/#kotlin.Function1[builder.Preamble,kotlin.Unit]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[withPreamble](with-preamble.md)(Function1<[Preamble](../-preamble/index.md), [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>config)  <br>  <br>More info  <br>This method allow add preamble config.  <br><br><br>|
| <a name="builder/LatexExamBuilder/withQuestions/#kotlin.Function1[builder.QuestionList,kotlin.Unit]/PointingToDeclaration/"></a>[withQuestions](with-questions.md)| <a name="builder/LatexExamBuilder/withQuestions/#kotlin.Function1[builder.QuestionList,kotlin.Unit]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[withQuestions](with-questions.md)(Function1<[QuestionList](../-question-list/index.md), [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>config)  <br>  <br>More info  <br>This method help user add question to exam.  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="builder/LatexExamBuilder/exportType/#/PointingToDeclaration/"></a>[exportType](index.md#736209278%2FProperties%2F-1216412040)| <a name="builder/LatexExamBuilder/exportType/#/PointingToDeclaration/"></a> [jvm] private [ExportType](../-export-type/index.md)[exportType](index.md#736209278%2FProperties%2F-1216412040)  <br>Export type of this exam: You can export tex file or pdf file.   <br>|
| <a name="builder/LatexExamBuilder/fileName/#/PointingToDeclaration/"></a>[fileName](index.md#1988998725%2FProperties%2F-1216412040)| <a name="builder/LatexExamBuilder/fileName/#/PointingToDeclaration/"></a> [jvm] private [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)[fileName](index.md#1988998725%2FProperties%2F-1216412040)  <br>Exam file name.   <br>|
| <a name="builder/LatexExamBuilder/questionTranslation/#/PointingToDeclaration/"></a>[questionTranslation](index.md#-882595581%2FProperties%2F-1216412040)| <a name="builder/LatexExamBuilder/questionTranslation/#/PointingToDeclaration/"></a> [jvm] private [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)[questionTranslation](index.md#-882595581%2FProperties%2F-1216412040)  <br>Translate "Question" in your language.   <br>|

