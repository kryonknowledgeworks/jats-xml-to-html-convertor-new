package org.kjms.xmlparser.article.back.sec;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class BackSecTitle implements Tag {
    private final Node node;

    public BackSecTitle(Node node) {
        this.node = node;
    }

    public String getElement() {
        return TagUtils.addH1Tag(node.getTextContent());
    }
}
