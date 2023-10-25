package org.kjms.xmlparser.commontag.baselinechangeelements;

import org.kjms.xmlparser.Tag;
import org.w3c.dom.Node;

public class BaselineChangeElements implements Tag {
    private final Node node;

    public BaselineChangeElements(Node node) {
        this.node = node;
    }

    public String getElement() {
        return "";
    }
}
