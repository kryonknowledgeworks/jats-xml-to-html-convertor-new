package org.kjms.xmlparser.commontag.group;

import org.kjms.xmlparser.Tag;
import org.w3c.dom.Node;

public class EmphasisElements implements Tag {
    private final Node node;

    public EmphasisElements(Node node) {
        this.node = node;
    }

    public String getElement() {
        return "";
    }
}
