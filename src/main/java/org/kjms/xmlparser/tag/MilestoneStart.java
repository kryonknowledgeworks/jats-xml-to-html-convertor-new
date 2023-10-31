package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Tag;
import org.w3c.dom.Node;

public class MilestoneStart implements Tag {
    private final Node node;

    public MilestoneStart(Node node) {
        this.node = node;
    }

    public String getElement() {
        return "";
    }
}
