package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class AwardDescription implements Tag {
    private final Node node;

    public AwardDescription(Node node) {
        this.node = node;
    }

    public String getElement() {
        return TagUtils.addPTag(node.getTextContent());
    }
}
