package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class TransSubtitle implements Tag {
    private final Node node;

    public TransSubtitle(Node node) {
        this.node = node;
    }

    public String getElement() {
        return TagUtils.addH1Tag(node.getTextContent());
    }
}
