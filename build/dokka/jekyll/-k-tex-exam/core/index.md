---
title: core -
---
//[KTexExam](../index.md)/[core](index.md)



# Package core  


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="core/Answer///PointingToDeclaration/"></a>[Answer](-answer/index.md)| <a name="core/Answer///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>data class [Answer](-answer/index.md)(**answerKey**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **answer**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **isTrueAnswer**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))  <br>More info  <br>This class represents a chosen option in the question [answerKey](-answer/answer-key.md): Character represents answer in the exam [answer](-answer/answer.md): Answer [isTrueAnswer](-answer/is-true-answer.md): The boolean variable represents the answer is correct or not  <br><br><br>
| <a name="core/Question///PointingToDeclaration/"></a>[Question](-question/index.md)| <a name="core/Question///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>data class [Question](-question/index.md)(**question**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **answerList**: [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)<[Answer](-answer/index.md)>, **solution**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>More info  <br><ul><li></li></ul>This class represent a question in an exam [question](-question/question.md): Question [answerList](-question/answer-list.md): Answer choice list [solution](-question/solution.md): Solution for this question.  <br><br><br>

