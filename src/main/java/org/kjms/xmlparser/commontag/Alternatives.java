package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Tag;
import org.w3c.dom.Node;

public class Alternatives implements Tag {
    private final Node node;

    public Alternatives(Node node) {
        this.node = node;
    }

    @Override
    public String getElement() {
        return Tag.super.getElement();
    }
}
