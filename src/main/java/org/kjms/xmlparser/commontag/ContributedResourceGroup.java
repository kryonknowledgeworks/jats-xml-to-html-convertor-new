package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class ContributedResourceGroup implements Tag {
    private final Node node;

    public ContributedResourceGroup(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.AWARD_GROUP)) {
                stringBuilder.append(new AwardGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SUPPORT_DESCRIPTION)) {
                stringBuilder.append(new SupportDescription(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.RESOURCE_GROUP)) {
                stringBuilder.append(new ResourceGroup(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
