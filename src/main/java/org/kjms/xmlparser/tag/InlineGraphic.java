package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.tag.group.AccessibilityElements;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class InlineGraphic implements Tag {
    private final Node node;

    public InlineGraphic(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (Element.ACCESSIBILITY_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new AccessibilityElements(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
