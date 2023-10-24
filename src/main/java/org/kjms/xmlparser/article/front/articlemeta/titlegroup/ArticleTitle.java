package org.kjms.xmlparser.article.front.articlemeta.titlegroup;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class ArticleTitle implements Tag {
    private final Node node;

    public ArticleTitle(Node node) {
        this.node = node;
    }

    public String getElement() {
        return TagUtils.addLabelTag(node.getTextContent());
    }
}