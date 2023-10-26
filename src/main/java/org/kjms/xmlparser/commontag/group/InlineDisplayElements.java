package org.kjms.xmlparser.commontag.group;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.InlineGraphic;
import org.kjms.xmlparser.commontag.InlineMedia;
import org.kjms.xmlparser.commontag.PrivateCharacter;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class InlineDisplayElements implements Tag {
    private final Node node;

    public InlineDisplayElements(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.INLINE_GRAPHIC)) {
                stringBuilder.append(new InlineGraphic(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.INLINE_MEDIA_OBJECT)) {
                stringBuilder.append(new InlineMedia(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PRIVATE_CHARACTER)) {
                stringBuilder.append(new PrivateCharacter(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
