package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Title implements Tag {
    private final Node node;

    public Title(Node node) {
        this.node = node;
    }

    public String getElement() {
        return TagUtils.addH1Tag(node.getTextContent());
    }
}
