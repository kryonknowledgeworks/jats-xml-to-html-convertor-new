package org.kjms.xmlparser.article.body.sec;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class BodySecLabel implements Tag {
    private final Node node;

    public BodySecLabel(Node node) {
        this.node = node;
    }

    public String getElement() {
        return TagUtils.addLabelTag(node.getTextContent());
    }
}
