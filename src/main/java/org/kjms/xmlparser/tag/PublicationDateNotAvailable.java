package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Tag;
import org.w3c.dom.Node;

public class PublicationDateNotAvailable implements Tag {
    private final Node node;

    public PublicationDateNotAvailable(Node node) {
        this.node = node;
    }

    public String getElement() {
        return "";
    }
}
