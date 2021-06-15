//[KTexExam](../../../index.md)/[latex](../index.md)/[LatexExamPaper](index.md)



# LatexExamPaper  
 [jvm] public final class [LatexExamPaper](index.md) implements [LatexPaper](../-latex-paper/index.md)

This class allow user print exam [preamble](index.md#1347295098%2FProperties%2F-1216412040): Preamble in latex file [header](index.md#-921092295%2FProperties%2F-1216412040): Text add before print answer list [questionList](index.md#1329695042%2FProperties%2F-1216412040): List of question in this exam [footer](index.md#-176859157%2FProperties%2F-1216412040) Text add after print answer list

   


## Constructors  
  
| | |
|---|---|
| <a name="latex/LatexExamPaper/LatexExamPaper/#kotlin.String#kotlin.String#kotlin.collections.List[latex.LatexQuestion]#kotlin.String/PointingToDeclaration/"></a>[LatexExamPaper](-latex-exam-paper.md)| <a name="latex/LatexExamPaper/LatexExamPaper/#kotlin.String#kotlin.String#kotlin.collections.List[latex.LatexQuestion]#kotlin.String/PointingToDeclaration/"></a> [jvm] [LatexExamPaper](index.md)[LatexExamPaper](-latex-exam-paper.md)([String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)preamble, [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)header, [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[LatexQuestion](../-latex-question/index.md)>questionList, [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)footer)  <br>   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="latex/LatexExamPaper/exportPdfFile/#kotlin.String/PointingToDeclaration/"></a>[exportPdfFile](index.md#-1440246006%2FFunctions%2F-1216412040)| <a name="latex/LatexExamPaper/exportPdfFile/#kotlin.String/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[exportPdfFile](index.md#-1440246006%2FFunctions%2F-1216412040)([String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)fileDir)  <br>  <br>More info  <br>export pdf file.  <br><br><br>|
| <a name="latex/LatexExamPaper/exportTexFile/#kotlin.String/PointingToDeclaration/"></a>[exportTexFile](index.md#-164572161%2FFunctions%2F-1216412040)| <a name="latex/LatexExamPaper/exportTexFile/#kotlin.String/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[exportTexFile](index.md#-164572161%2FFunctions%2F-1216412040)([String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)fileDir)  <br>  <br>More info  <br>Export tex file.  <br><br><br>|
| <a name="latex/LatexExamPaper/generateLatexString/#/PointingToDeclaration/"></a>[generateLatexString](generate-latex-string.md)| <a name="latex/LatexExamPaper/generateLatexString/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)[generateLatexString](generate-latex-string.md)()  <br>  <br>More info  <br>Generate tex code to export tex file  <br><br><br>|
| <a name="latex/LatexExamPaper/getFooter/#/PointingToDeclaration/"></a>[getFooter](get-footer.md)| <a name="latex/LatexExamPaper/getFooter/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>final [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)[getFooter](get-footer.md)()  <br>  <br><br><br>|
| <a name="latex/LatexExamPaper/getHeader/#/PointingToDeclaration/"></a>[getHeader](get-header.md)| <a name="latex/LatexExamPaper/getHeader/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>final [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)[getHeader](get-header.md)()  <br>  <br><br><br>|
| <a name="latex/LatexExamPaper/getPreamble/#/PointingToDeclaration/"></a>[getPreamble](get-preamble.md)| <a name="latex/LatexExamPaper/getPreamble/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>final [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)[getPreamble](get-preamble.md)()  <br>  <br><br><br>|
| <a name="latex/LatexExamPaper/getQuestionList/#/PointingToDeclaration/"></a>[getQuestionList](get-question-list.md)| <a name="latex/LatexExamPaper/getQuestionList/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>final [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[LatexQuestion](../-latex-question/index.md)>[getQuestionList](get-question-list.md)()  <br>  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="latex/LatexExamPaper/footer/#/PointingToDeclaration/"></a>[footer](index.md#-176859157%2FProperties%2F-1216412040)| <a name="latex/LatexExamPaper/footer/#/PointingToDeclaration/"></a> [jvm] private final [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)[footer](index.md#-176859157%2FProperties%2F-1216412040)  <br>   <br>|
| <a name="latex/LatexExamPaper/header/#/PointingToDeclaration/"></a>[header](index.md#-921092295%2FProperties%2F-1216412040)| <a name="latex/LatexExamPaper/header/#/PointingToDeclaration/"></a> [jvm] private final [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)[header](index.md#-921092295%2FProperties%2F-1216412040)  <br>   <br>|
| <a name="latex/LatexExamPaper/preamble/#/PointingToDeclaration/"></a>[preamble](index.md#1347295098%2FProperties%2F-1216412040)| <a name="latex/LatexExamPaper/preamble/#/PointingToDeclaration/"></a> [jvm] private final [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)[preamble](index.md#1347295098%2FProperties%2F-1216412040)  <br>   <br>|
| <a name="latex/LatexExamPaper/questionList/#/PointingToDeclaration/"></a>[questionList](index.md#1329695042%2FProperties%2F-1216412040)| <a name="latex/LatexExamPaper/questionList/#/PointingToDeclaration/"></a> [jvm] private final [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[LatexQuestion](../-latex-question/index.md)>[questionList](index.md#1329695042%2FProperties%2F-1216412040)  <br>   <br>|

