package com.example

class Main {

    private val completeCodeWithMarkdownMarkerAndCode = """
        Here are 2 HTML tags and their usages with detailed examples:

        1. **`<a>`**: Defines a hyperlink.
           ```html
           <a href=\"https://www.example.com\">Visit Example</a>
           ```

        2. **`<p>`**: Defines a paragraph.
           ```html
           <p>This is a paragraph of text.</p>
           ```
    """.trimIndent()

    private fun testParseMarkdownWithCodeBlockMarkerAndCode() {
        Markdown.printAST(completeCodeWithMarkdownMarkerAndCode)
    }

    fun main() {
        testParseMarkdownWithCodeBlockMarkerAndCode()
    }
}

fun main() {
    Main().main()
}
