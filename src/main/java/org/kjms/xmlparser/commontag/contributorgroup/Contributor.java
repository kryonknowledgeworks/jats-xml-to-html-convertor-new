package org.kjms.xmlparser.commontag.contributorgroup;

import org.kjms.xmlparser.Tag;
import org.w3c.dom.Node;

public class Contributor implements Tag {
    private final Node node;

    public Contributor(Node node) {
        this.node = node;
    }

    public String getElement() {
        return Tag.super.getElement();
    }
}
