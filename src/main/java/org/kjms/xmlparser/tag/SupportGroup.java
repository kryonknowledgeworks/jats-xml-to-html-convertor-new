package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class SupportGroup implements Tag {
    private final Node node;

    public SupportGroup(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.FUNDING_GROUP)) {
                stringBuilder.append(new FundingGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CONTRIBUTED_RESOURCE_GROUP)) {
                stringBuilder.append(new ContributedResourceGroup(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
