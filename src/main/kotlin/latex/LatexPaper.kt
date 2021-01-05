package latex

import java.io.File

/**
 * This interface help user generate tex file and pdf file.
 */
interface LatexPaper {
    /**
     * abstract method to get latex code.
     */
    fun generateLatexString(): String

    /**
     * Export tex file.
     */
    fun exportTexFile(fileDir: String) {
        val content = generateLatexString()
        File(fileDir).bufferedWriter().use {
            it.write(content)
        }
    }

    /**
     * export pdf file.
     */
    fun exportPdfFile(fileDir: String) {
        exportTexFile(fileDir)
        Runtime.getRuntime().exec("pdflatex $fileDir")
    }
}