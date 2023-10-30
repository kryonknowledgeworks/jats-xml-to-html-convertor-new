package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Publisher implements Tag {
    private final Node node;

    public Publisher(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.PUBLISHER_NAME)) {
                stringBuilder.append(new PublisherName(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PUBLISHER_LOCATION)) {
                stringBuilder.append(new PublisherLocation(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
