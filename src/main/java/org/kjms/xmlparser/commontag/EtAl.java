package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Tag;
import org.w3c.dom.Node;

public class EtAl implements Tag {
    private final Node node;

    public EtAl(Node node) {
        this.node = node;
    }

    public String getElement() {
        return Tag.super.getElement();
    }
}
