package org.kjms.xmlparser.article.back.ack;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class AckTitle implements Tag {
    private final Node node;

    public AckTitle(Node node) {
        this.node = node;
    }

    public String getElement() {
        return TagUtils.addH1Tag(node.getTextContent());
    }
}
