package org.kjms.xmlparser.article.back.ack;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class AckP implements Tag {
    private final Node node;

    public AckP(Node node) {
        this.node = node;
    }

    public String getElement() {
        return TagUtils.addPTag(node.getTextContent());
    }
}
