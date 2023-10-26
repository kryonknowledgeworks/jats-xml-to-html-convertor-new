package org.kjms.xmlparser.commontag.group;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class RelatedMaterialElements implements Tag {
    private final Node node;

    public RelatedMaterialElements(Node node) {
        this.node = node;
    }

    public String getElement() {
        return TagUtils.addBTag(node.getTextContent());
    }
}
