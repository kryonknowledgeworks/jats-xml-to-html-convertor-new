package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class ObjectId implements Tag {
    private final Node node;

    public ObjectId(Node node) {
        this.node = node;
    }

    public String getElement() {
        return TagUtils.addSpanTag(node.getTextContent());
    }
}
