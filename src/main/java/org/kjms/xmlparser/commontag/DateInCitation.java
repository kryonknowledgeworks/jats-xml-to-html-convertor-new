package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class DateInCitation implements Tag {

    private final Node node;

    public DateInCitation(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.TEXT)) {
                stringBuilder.append(node.getTextContent());
            } else if (nodeName.equalsIgnoreCase(Element.DAY)) {
                stringBuilder.append(new Date(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.MONTH)) {
                stringBuilder.append(new Month(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.YEAR)) {
                stringBuilder.append(new Year(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SEASON)) {
                stringBuilder.append(new Season(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ERA)) {
                stringBuilder.append(new Era(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());

    }
}
