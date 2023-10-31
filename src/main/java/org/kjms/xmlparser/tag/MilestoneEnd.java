package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Tag;
import org.w3c.dom.Node;

public class MilestoneEnd implements Tag {
    private final Node node;

    public MilestoneEnd(Node node) {
        this.node = node;
    }

    public String getElement() {
        return "";
    }
}
