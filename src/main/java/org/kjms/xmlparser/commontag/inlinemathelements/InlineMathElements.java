package org.kjms.xmlparser.commontag.inlinemathelements;

import org.kjms.xmlparser.Tag;
import org.w3c.dom.Node;

public class InlineMathElements implements Tag {
    private final Node node;

    public InlineMathElements(Node node) {
        this.node = node;
    }

    public String getElement() {
        return "";
    }
}
