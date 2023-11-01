package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

import java.util.Map;

public class Email implements Tag {
    private final Node node;

    public Email(Node node) {
        this.node = node;
    }

    public String getElement() {
        return TagUtils.addATag(Map.of("href", "mailto:" + node.getTextContent()), node.getTextContent());
    }
}
