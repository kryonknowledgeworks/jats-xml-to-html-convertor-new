package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class AliFreeToRead implements Tag {
    private final Node node;

    public AliFreeToRead(Node node) {
        this.node = node;
    }

    public String getElement() {
        return TagUtils.addATag(node.getAttributes().getNamedItem("xmlns:ali").getNodeValue());
    }
}
