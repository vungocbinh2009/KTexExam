//[KTexExam](../../../index.md)/[latex](../index.md)/[LatexExamAnswer](index.md)



# LatexExamAnswer  
 [jvm] public final class [LatexExamAnswer](index.md) implements [LatexPaper](../-latex-paper/index.md)

This class allow user print exam answer [preamble](index.md#1161558228%2FProperties%2F-1216412040): Preamble in latex file [header](index.md#115584787%2FProperties%2F-1216412040): Text add before print answer list [questionList](index.md#1833643420%2FProperties%2F-1216412040): List of question in this exam [footer](index.md#859817925%2FProperties%2F-1216412040) Text add after print answer list

   


## Constructors  
  
| | |
|---|---|
| <a name="latex/LatexExamAnswer/LatexExamAnswer/#kotlin.String#kotlin.String#kotlin.collections.List[latex.LatexQuestion]#kotlin.String/PointingToDeclaration/"></a>[LatexExamAnswer](-latex-exam-answer.md)| <a name="latex/LatexExamAnswer/LatexExamAnswer/#kotlin.String#kotlin.String#kotlin.collections.List[latex.LatexQuestion]#kotlin.String/PointingToDeclaration/"></a> [jvm] [LatexExamAnswer](index.md)[LatexExamAnswer](-latex-exam-answer.md)([String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)preamble, [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)header, [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[LatexQuestion](../-latex-question/index.md)>questionList, [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)footer)  <br>   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="latex/LatexExamAnswer/exportPdfFile/#kotlin.String/PointingToDeclaration/"></a>[exportPdfFile](index.md#732272100%2FFunctions%2F-1216412040)| <a name="latex/LatexExamAnswer/exportPdfFile/#kotlin.String/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[exportPdfFile](index.md#732272100%2FFunctions%2F-1216412040)([String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)fileDir)  <br>  <br>More info  <br>export pdf file.  <br><br><br>|
| <a name="latex/LatexExamAnswer/exportTexFile/#kotlin.String/PointingToDeclaration/"></a>[exportTexFile](index.md#2007945945%2FFunctions%2F-1216412040)| <a name="latex/LatexExamAnswer/exportTexFile/#kotlin.String/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[exportTexFile](index.md#2007945945%2FFunctions%2F-1216412040)([String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)fileDir)  <br>  <br>More info  <br>Export tex file.  <br><br><br>|
| <a name="latex/LatexExamAnswer/generateLatexString/#/PointingToDeclaration/"></a>[generateLatexString](generate-latex-string.md)| <a name="latex/LatexExamAnswer/generateLatexString/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)[generateLatexString](generate-latex-string.md)()  <br>  <br>More info  <br>Generate tex code to export tex file  <br><br><br>|
| <a name="latex/LatexExamAnswer/getFooter/#/PointingToDeclaration/"></a>[getFooter](get-footer.md)| <a name="latex/LatexExamAnswer/getFooter/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>final [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)[getFooter](get-footer.md)()  <br>  <br><br><br>|
| <a name="latex/LatexExamAnswer/getHeader/#/PointingToDeclaration/"></a>[getHeader](get-header.md)| <a name="latex/LatexExamAnswer/getHeader/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>final [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)[getHeader](get-header.md)()  <br>  <br><br><br>|
| <a name="latex/LatexExamAnswer/getPreamble/#/PointingToDeclaration/"></a>[getPreamble](get-preamble.md)| <a name="latex/LatexExamAnswer/getPreamble/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>final [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)[getPreamble](get-preamble.md)()  <br>  <br><br><br>|
| <a name="latex/LatexExamAnswer/getQuestionList/#/PointingToDeclaration/"></a>[getQuestionList](get-question-list.md)| <a name="latex/LatexExamAnswer/getQuestionList/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>final [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[LatexQuestion](../-latex-question/index.md)>[getQuestionList](get-question-list.md)()  <br>  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="latex/LatexExamAnswer/footer/#/PointingToDeclaration/"></a>[footer](index.md#859817925%2FProperties%2F-1216412040)| <a name="latex/LatexExamAnswer/footer/#/PointingToDeclaration/"></a> [jvm] private final [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)[footer](index.md#859817925%2FProperties%2F-1216412040)  <br>   <br>|
| <a name="latex/LatexExamAnswer/header/#/PointingToDeclaration/"></a>[header](index.md#115584787%2FProperties%2F-1216412040)| <a name="latex/LatexExamAnswer/header/#/PointingToDeclaration/"></a> [jvm] private final [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)[header](index.md#115584787%2FProperties%2F-1216412040)  <br>   <br>|
| <a name="latex/LatexExamAnswer/preamble/#/PointingToDeclaration/"></a>[preamble](index.md#1161558228%2FProperties%2F-1216412040)| <a name="latex/LatexExamAnswer/preamble/#/PointingToDeclaration/"></a> [jvm] private final [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)[preamble](index.md#1161558228%2FProperties%2F-1216412040)  <br>   <br>|
| <a name="latex/LatexExamAnswer/questionList/#/PointingToDeclaration/"></a>[questionList](index.md#1833643420%2FProperties%2F-1216412040)| <a name="latex/LatexExamAnswer/questionList/#/PointingToDeclaration/"></a> [jvm] private final [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[LatexQuestion](../-latex-question/index.md)>[questionList](index.md#1833643420%2FProperties%2F-1216412040)  <br>   <br>|

