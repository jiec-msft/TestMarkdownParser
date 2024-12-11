Input:

````
Here are 2 HTML tags and their usages with detailed examples:

1. **`<a>`**: Defines a hyperlink.
   ```html
   <a href=\"https://www.example.com\">Visit Example</a>
   ```

2. **`<p>`**: Defines a paragraph.
   ```html
   <p>This is a paragraph of text.</p>
   ```
````

Output:

```
Markdown:MARKDOWN_FILE
  Markdown:PARAGRAPH
    Markdown:TEXT
    Markdown::
  Markdown:EOL
  Markdown:EOL
  Markdown:ORDERED_LIST
    Markdown:LIST_ITEM
      Markdown:LIST_NUMBER
      Markdown:PARAGRAPH
        Markdown:STRONG
          Markdown:EMPH
          Markdown:EMPH
          Markdown:CODE_SPAN
            Markdown:BACKTICK
            Markdown:HTML_TAG
            Markdown:BACKTICK
          Markdown:EMPH
          Markdown:EMPH
        Markdown::
        WHITE_SPACE
        Markdown:TEXT
      Markdown:EOL
      WHITE_SPACE
      Markdown:CODE_FENCE
        Markdown:CODE_FENCE_START
        Markdown:FENCE_LANG
        Markdown:EOL
        WHITE_SPACE
        Markdown:CODE_FENCE_CONTENT
        Markdown:EOL
        Markdown:CODE_FENCE_END
    Markdown:EOL
    Markdown:EOL
    Markdown:LIST_ITEM
      Markdown:LIST_NUMBER
      Markdown:PARAGRAPH
        Markdown:STRONG
          Markdown:EMPH
          Markdown:EMPH
          Markdown:CODE_SPAN
            Markdown:BACKTICK
            Markdown:HTML_TAG
            Markdown:BACKTICK
          Markdown:EMPH
          Markdown:EMPH
        Markdown::
        WHITE_SPACE
        Markdown:TEXT
      Markdown:EOL
      WHITE_SPACE
      Markdown:CODE_FENCE
        Markdown:CODE_FENCE_START
        Markdown:FENCE_LANG
        Markdown:EOL
        WHITE_SPACE
        Markdown:CODE_FENCE_CONTENT
        Markdown:EOL
        Markdown:CODE_FENCE_END

```