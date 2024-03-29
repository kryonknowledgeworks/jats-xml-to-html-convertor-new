package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class PrivateCharacter implements Tag {
    private final Node node;

    public PrivateCharacter(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.GLYPH_DATA)) {
                stringBuilder.append(new GlyphData(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.GLYPH_REFERENCE)) {
                stringBuilder.append(new GlyphReference(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.INLINE_GRAPHIC)) {
                stringBuilder.append(new InlineGraphic(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
