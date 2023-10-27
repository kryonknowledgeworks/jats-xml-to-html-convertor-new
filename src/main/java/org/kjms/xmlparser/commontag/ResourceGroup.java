package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class ResourceGroup implements Tag {
    private final Node node;

    public ResourceGroup(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.RESOURCE_NAME)) {
                stringBuilder.append(new ResourceName(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.RESOURCE_WRAP)) {
                stringBuilder.append(new ResourceWrapper(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
