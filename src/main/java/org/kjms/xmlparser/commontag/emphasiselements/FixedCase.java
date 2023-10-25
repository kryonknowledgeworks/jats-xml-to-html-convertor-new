package org.kjms.xmlparser.commontag.emphasiselements;

import org.kjms.xmlparser.Tag;
import org.w3c.dom.Node;

public class FixedCase implements Tag {
    private final Node node;

    public FixedCase(Node node) {
        this.node = node;
    }

    // todo: Fixed Case is pending
    public String getElement() {
        return "";
    }
}
