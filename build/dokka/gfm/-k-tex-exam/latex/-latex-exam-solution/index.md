//[KTexExam](../../../index.md)/[latex](../index.md)/[LatexExamSolution](index.md)



# LatexExamSolution  
 [jvm] public final class [LatexExamSolution](index.md) implements [LatexPaper](../-latex-paper/index.md)

This class allow user print exam solution. [preamble](index.md#1819706063%2FProperties%2F-1216412040): Preamble in latex file [header](index.md#-241271858%2FProperties%2F-1216412040): Text add before print answer list [questionList](index.md#-1424873%2FProperties%2F-1216412040): List of question in this exam [footer](index.md#502961280%2FProperties%2F-1216412040) Text add after print answer list

   


## Constructors  
  
| | |
|---|---|
| <a name="latex/LatexExamSolution/LatexExamSolution/#kotlin.String#kotlin.String#kotlin.collections.List[latex.LatexQuestion]#kotlin.String/PointingToDeclaration/"></a>[LatexExamSolution](-latex-exam-solution.md)| <a name="latex/LatexExamSolution/LatexExamSolution/#kotlin.String#kotlin.String#kotlin.collections.List[latex.LatexQuestion]#kotlin.String/PointingToDeclaration/"></a> [jvm] [LatexExamSolution](index.md)[LatexExamSolution](-latex-exam-solution.md)([String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)preamble, [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)header, [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[LatexQuestion](../-latex-question/index.md)>questionList, [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)footer)  <br>   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="latex/LatexExamSolution/exportPdfFile/#kotlin.String/PointingToDeclaration/"></a>[exportPdfFile](index.md#-1933723873%2FFunctions%2F-1216412040)| <a name="latex/LatexExamSolution/exportPdfFile/#kotlin.String/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[exportPdfFile](index.md#-1933723873%2FFunctions%2F-1216412040)([String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)fileDir)  <br>  <br>More info  <br>export pdf file.  <br><br><br>|
| <a name="latex/LatexExamSolution/exportTexFile/#kotlin.String/PointingToDeclaration/"></a>[exportTexFile](index.md#-658050028%2FFunctions%2F-1216412040)| <a name="latex/LatexExamSolution/exportTexFile/#kotlin.String/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[exportTexFile](index.md#-658050028%2FFunctions%2F-1216412040)([String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)fileDir)  <br>  <br>More info  <br>Export tex file.  <br><br><br>|
| <a name="latex/LatexExamSolution/generateLatexString/#/PointingToDeclaration/"></a>[generateLatexString](generate-latex-string.md)| <a name="latex/LatexExamSolution/generateLatexString/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)[generateLatexString](generate-latex-string.md)()  <br>  <br>More info  <br>Generate tex code to export tex file  <br><br><br>|
| <a name="latex/LatexExamSolution/getFooter/#/PointingToDeclaration/"></a>[getFooter](get-footer.md)| <a name="latex/LatexExamSolution/getFooter/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>final [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)[getFooter](get-footer.md)()  <br>  <br><br><br>|
| <a name="latex/LatexExamSolution/getHeader/#/PointingToDeclaration/"></a>[getHeader](get-header.md)| <a name="latex/LatexExamSolution/getHeader/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>final [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)[getHeader](get-header.md)()  <br>  <br><br><br>|
| <a name="latex/LatexExamSolution/getPreamble/#/PointingToDeclaration/"></a>[getPreamble](get-preamble.md)| <a name="latex/LatexExamSolution/getPreamble/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>final [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)[getPreamble](get-preamble.md)()  <br>  <br><br><br>|
| <a name="latex/LatexExamSolution/getQuestionList/#/PointingToDeclaration/"></a>[getQuestionList](get-question-list.md)| <a name="latex/LatexExamSolution/getQuestionList/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>final [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[LatexQuestion](../-latex-question/index.md)>[getQuestionList](get-question-list.md)()  <br>  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="latex/LatexExamSolution/footer/#/PointingToDeclaration/"></a>[footer](index.md#502961280%2FProperties%2F-1216412040)| <a name="latex/LatexExamSolution/footer/#/PointingToDeclaration/"></a> [jvm] private final [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)[footer](index.md#502961280%2FProperties%2F-1216412040)  <br>   <br>|
| <a name="latex/LatexExamSolution/header/#/PointingToDeclaration/"></a>[header](index.md#-241271858%2FProperties%2F-1216412040)| <a name="latex/LatexExamSolution/header/#/PointingToDeclaration/"></a> [jvm] private final [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)[header](index.md#-241271858%2FProperties%2F-1216412040)  <br>   <br>|
| <a name="latex/LatexExamSolution/preamble/#/PointingToDeclaration/"></a>[preamble](index.md#1819706063%2FProperties%2F-1216412040)| <a name="latex/LatexExamSolution/preamble/#/PointingToDeclaration/"></a> [jvm] private final [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)[preamble](index.md#1819706063%2FProperties%2F-1216412040)  <br>   <br>|
| <a name="latex/LatexExamSolution/questionList/#/PointingToDeclaration/"></a>[questionList](index.md#-1424873%2FProperties%2F-1216412040)| <a name="latex/LatexExamSolution/questionList/#/PointingToDeclaration/"></a> [jvm] private final [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[LatexQuestion](../-latex-question/index.md)>[questionList](index.md#-1424873%2FProperties%2F-1216412040)  <br>   <br>|

