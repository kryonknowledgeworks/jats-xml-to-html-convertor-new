package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class HorizontalRule implements Tag {
    private final Node node;

    public HorizontalRule(Node node) {
        this.node = node;
    }

    public String getElement() {
        return "";
    }
}
