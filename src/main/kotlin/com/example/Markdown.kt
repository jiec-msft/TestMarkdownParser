package com.example

import org.intellij.markdown.ast.ASTNode
import org.intellij.markdown.flavours.gfm.GFMFlavourDescriptor
import org.intellij.markdown.parser.MarkdownParser

object Markdown {

    private fun getMarkdownAst(rawMarkdown: String): MarkdownASTEnvelope {
        val markdown = rawMarkdown.trim()
        val flavour = GFMFlavourDescriptor()
        return MarkdownASTEnvelope(
            markdown = markdown,
            astRoot = MarkdownParser(flavour).buildMarkdownTreeFromString(markdown)
        )
    }

    fun printAST(rawMarkdown: String) {
        val astEnvelope = getMarkdownAst(rawMarkdown)

        // recursively traverse the AST astEnvelope and print them in a tree-like format
        fun printAST(node: ASTNode, level: Int = 0) {
            println("  ".repeat(level) + node.type)
            for (child in node.children) {
                printAST(child, level + 1)
            }
        }

        printAST(astEnvelope.astRoot)
    }
}
