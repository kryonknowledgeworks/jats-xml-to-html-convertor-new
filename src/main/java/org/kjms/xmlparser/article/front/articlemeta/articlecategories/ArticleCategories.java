package org.kjms.xmlparser.article.front.articlemeta.articlecategories;

import org.kjms.xmlparser.Tag;
import org.w3c.dom.Node;

public class ArticleCategories implements Tag {

    private Node node;

    public ArticleCategories(Node node) {
        this.node = node;
    }

    public String getElement() {
        return "";
    }
}
