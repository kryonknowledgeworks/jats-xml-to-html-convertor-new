package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
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
