---
title: LatexExamSolution -
---
//[KTexExam](../../index.md)/[latex](../index.md)/[LatexExamSolution](index.md)



# LatexExamSolution  
 [jvm] class [LatexExamSolution](index.md)(**preamble**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **header**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **questionList**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[LatexQuestion](../-latex-question/index.md)>, **footer**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [LatexPaper](../-latex-paper/index.md)

This class allow user print exam solution. [preamble](preamble.md): Preamble in latex file [header](header.md): Text add before print answer list [questionList](question-list.md): List of question in this exam [footer](footer.md) Text add after print answer list

   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="latex/LatexExamSolution/LatexExamSolution/#kotlin.String#kotlin.String#kotlin.collections.List[latex.LatexQuestion]#kotlin.String/PointingToDeclaration/"></a>[LatexExamSolution](-latex-exam-solution.md)| <a name="latex/LatexExamSolution/LatexExamSolution/#kotlin.String#kotlin.String#kotlin.collections.List[latex.LatexQuestion]#kotlin.String/PointingToDeclaration/"></a> [jvm] fun [LatexExamSolution](-latex-exam-solution.md)(preamble: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), header: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), questionList: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[LatexQuestion](../-latex-question/index.md)>, footer: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../-latex-question/-companion/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1181323363)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open operator fun [equals](../-latex-question/-companion/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1181323363)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="latex/LatexPaper/exportPdfFile/#kotlin.String/PointingToDeclaration/"></a>[exportPdfFile](../-latex-paper/export-pdf-file.md)| <a name="latex/LatexPaper/exportPdfFile/#kotlin.String/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [exportPdfFile](../-latex-paper/export-pdf-file.md)(fileDir: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>More info  <br>export pdf file.  <br><br><br>
| <a name="latex/LatexPaper/exportTexFile/#kotlin.String/PointingToDeclaration/"></a>[exportTexFile](../-latex-paper/export-tex-file.md)| <a name="latex/LatexPaper/exportTexFile/#kotlin.String/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [exportTexFile](../-latex-paper/export-tex-file.md)(fileDir: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>More info  <br>Export tex file.  <br><br><br>
| <a name="latex/LatexExamSolution/generateLatexString/#/PointingToDeclaration/"></a>[generateLatexString](generate-latex-string.md)| <a name="latex/LatexExamSolution/generateLatexString/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [generateLatexString](generate-latex-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br>More info  <br>Generate tex code to export tex file  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../-latex-question/-companion/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1181323363)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [hashCode](../-latex-question/-companion/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1181323363)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../-latex-question/-companion/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1181323363)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [toString](../-latex-question/-companion/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1181323363)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="latex/LatexExamSolution/footer/#/PointingToDeclaration/"></a>[footer](footer.md)| <a name="latex/LatexExamSolution/footer/#/PointingToDeclaration/"></a> [jvm] val [footer](footer.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>
| <a name="latex/LatexExamSolution/header/#/PointingToDeclaration/"></a>[header](header.md)| <a name="latex/LatexExamSolution/header/#/PointingToDeclaration/"></a> [jvm] val [header](header.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>
| <a name="latex/LatexExamSolution/preamble/#/PointingToDeclaration/"></a>[preamble](preamble.md)| <a name="latex/LatexExamSolution/preamble/#/PointingToDeclaration/"></a> [jvm] val [preamble](preamble.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>
| <a name="latex/LatexExamSolution/questionList/#/PointingToDeclaration/"></a>[questionList](question-list.md)| <a name="latex/LatexExamSolution/questionList/#/PointingToDeclaration/"></a> [jvm] val [questionList](question-list.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[LatexQuestion](../-latex-question/index.md)>   <br>

