package com.example

import org.intellij.markdown.ast.ASTNode

data class MarkdownASTEnvelope(
    val markdown: String,
    var astRoot: ASTNode
)
