package org.kjms.xmlparser.tag.group;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.tag.AlternateText;
import org.kjms.xmlparser.tag.LongDescription;
import org.w3c.dom.Node;

public class AccessibilityElements implements Tag {
    private final Node node;

    public AccessibilityElements(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        final String nodeName = node.getNodeName();

        if (nodeName.equalsIgnoreCase(Element.ALTERNATE_TEXT)) {
            stringBuilder.append(new AlternateText(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.LONG_DESCRIPTION)) {
            stringBuilder.append(new LongDescription(node).getElement());
        }

        return stringBuilder.toString();
    }
}
