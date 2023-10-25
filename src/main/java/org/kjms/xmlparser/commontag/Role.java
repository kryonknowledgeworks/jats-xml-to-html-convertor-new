package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Tag;
import org.w3c.dom.Node;

public class Role implements Tag {
    private final Node node;

    public Role(Node node) {
        this.node = node;
    }

    public String getElement() {
        return Tag.super.getElement();
    }
}
