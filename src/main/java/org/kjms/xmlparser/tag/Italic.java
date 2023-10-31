package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Italic implements Tag {
    private final Node node;

    public Italic(Node node) {
        this.node = node;
    }

    public String getElement() {
        return TagUtils.addITag(node.getTextContent());
    }
}
