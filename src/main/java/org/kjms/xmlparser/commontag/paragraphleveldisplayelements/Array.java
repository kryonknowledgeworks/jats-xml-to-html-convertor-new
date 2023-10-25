package org.kjms.xmlparser.commontag.paragraphleveldisplayelements;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Array implements Tag {
    private final Node node;

    public Array(Node node) {
        this.node = node;
    }

    public String getElement() {
        return TagUtils.addBTag(node.getTextContent());
    }
}
