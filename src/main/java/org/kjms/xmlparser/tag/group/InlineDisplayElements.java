package org.kjms.xmlparser.tag.group;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.tag.InlineGraphic;
import org.kjms.xmlparser.tag.InlineMedia;
import org.kjms.xmlparser.tag.PrivateCharacter;
import org.w3c.dom.Node;

public class InlineDisplayElements implements Tag {
    private final Node node;

    public InlineDisplayElements(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        final String nodeName = node.getNodeName();

        if (nodeName.equalsIgnoreCase(Element.INLINE_GRAPHIC)) {
            stringBuilder.append(new InlineGraphic(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.INLINE_MEDIA_OBJECT)) {
            stringBuilder.append(new InlineMedia(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.PRIVATE_CHARACTER)) {
            stringBuilder.append(new PrivateCharacter(node).getElement());
        }

        return stringBuilder.toString();
    }
}
