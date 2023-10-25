package org.kjms.xmlparser.commontag.otherinlineelements;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class OtherInlineElements implements Tag {
    private final Node node;

    public OtherInlineElements(Node node) {
        this.node = node;
    }

    public String getElement() {
        return TagUtils.addBTag(node.getTextContent());
    }
}
