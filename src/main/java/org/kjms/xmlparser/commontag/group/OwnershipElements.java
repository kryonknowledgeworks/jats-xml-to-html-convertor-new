package org.kjms.xmlparser.commontag.group;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.Attribution;
import org.kjms.xmlparser.commontag.Permissions;
import org.kjms.xmlparser.commontag.SectionMeta;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class OwnershipElements implements Tag {
    private final Node node;

    public OwnershipElements(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.ATTRIBUTION)) {
                stringBuilder.append(new Attribution(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PERMISSIONS)) {
                stringBuilder.append(new Permissions(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
