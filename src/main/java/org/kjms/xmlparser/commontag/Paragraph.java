package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Tag;
import org.w3c.dom.Node;

public class Paragraph implements Tag {

    private final Node node;

    public Paragraph(Node node) {
        this.node = node;
    }

    public String getElement() {
        return "";
    }
}
