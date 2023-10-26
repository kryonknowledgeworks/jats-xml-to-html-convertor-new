package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Tag;
import org.w3c.dom.Node;

public class BreakLine implements Tag {
    private final Node node;

    public BreakLine(Node node) {
        this.node = node;
    }

    public String getElement() {
        return "<br>";
    }
}