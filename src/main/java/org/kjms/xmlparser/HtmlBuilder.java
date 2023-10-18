package org.kjms.xmlparser;

import org.kjms.xmlparser.article.Article;
import org.w3c.dom.Document;

public interface HtmlBuilder {

    static String buildHtml(Document document) {
        String doctype = "<!DOCTYPE html>";

        Article article = new Article(document.getDocumentElement());

        return doctype + "<html><head></head>" + article.getElement() + "</html>";
    }
}
