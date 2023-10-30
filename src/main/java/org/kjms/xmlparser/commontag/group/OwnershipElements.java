package org.kjms.xmlparser.commontag.group;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.Attribution;
import org.kjms.xmlparser.commontag.Permissions;
import org.w3c.dom.Node;

public class OwnershipElements implements Tag {
    private final Node node;

    public OwnershipElements(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        final String nodeName = node.getNodeName();

        if (nodeName.equalsIgnoreCase(Element.ATTRIBUTION)) {
            stringBuilder.append(new Attribution(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.PERMISSIONS)) {
            stringBuilder.append(new Permissions(node).getElement());
        }

        return stringBuilder.toString();
    }
}
