package org.kjms.xmlparser;

import org.kjms.xmlparser.article.Article;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Document;

import javax.swing.text.Style;

public interface HtmlBuilder {

    static String buildHtml(Document document) {
        String doctype = "<!DOCTYPE html>";

        Article article = new Article(document.getDocumentElement());

        return doctype + ("<html><head>" + getScript() + "</head>" + TagUtils.addBodyTag(article.getElement(), "overflow-x:hidden", "0") + "</html>");
    }

    // script added for tex-math class for <tex-math> jats tag
    private static String getScript() {
        return """
                <script type="text/javascript" async
                  src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/MathJax.js?config=TeX-MML-AM_CHTML">
                </script>
                """;
    }
}
