package org.kjms.xmlparser.commontag.addresselements;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class City implements Tag {
    private final Node node;

    public City(Node node) {
        this.node = node;
    }

    public String getElement() {

        if (node.getChildNodes().getLength() > 0 && node.getNodeName().equals(Element.TEXT)) {
            return TagUtils.addSpanTag(node.getTextContent());
        }

        return "";
    }
}
