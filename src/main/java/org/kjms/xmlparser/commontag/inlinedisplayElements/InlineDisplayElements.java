package org.kjms.xmlparser.commontag.inlinedisplayElements;

import org.kjms.xmlparser.Tag;
import org.w3c.dom.Node;

public class InlineDisplayElements implements Tag {
    private final Node node;

    public InlineDisplayElements(Node node) {
        this.node = node;
    }

    public String getElement() {
        return "";
    }
}
