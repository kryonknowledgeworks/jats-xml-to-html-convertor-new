package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.group.LinkingElement;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class StringDate implements Tag {
    private final Node node;

    public StringDate(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.TEXT)) {
                stringBuilder.append(TagUtils.addSpanTag(childNode.getTextContent()));
            } else if (nodeName.equalsIgnoreCase(Element.DAY)) {
                stringBuilder.append(new Day(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ERA)) {
                stringBuilder.append(new Era(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.MONTH)) {
                stringBuilder.append(new Month(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SEASON)) {
                stringBuilder.append(new Season(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.YEAR)) {
                stringBuilder.append(new Year(childNode).getElement());
            }
        }

        return TagUtils.addSpanTag(stringBuilder.toString());
    }
}
