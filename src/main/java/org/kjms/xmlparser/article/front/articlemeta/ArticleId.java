package org.kjms.xmlparser.article.front.articlemeta;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class ArticleId implements Tag {

    private final Node node;

    public ArticleId(Node node) {
        this.node = node;
    }

    public String getElement() {
        return TagUtils.addLabelTag(node.getTextContent());
    }
}
