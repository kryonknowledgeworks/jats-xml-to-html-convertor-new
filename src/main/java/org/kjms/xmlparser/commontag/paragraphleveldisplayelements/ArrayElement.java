package org.kjms.xmlparser.commontag.paragraphleveldisplayelements;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class ArrayElement implements Tag {
    private final Node node;

    public ArrayElement(Node node) {
        this.node = node;
    }

    public String getElement() {
        return TagUtils.addBTag(node.getTextContent());
    }
}
