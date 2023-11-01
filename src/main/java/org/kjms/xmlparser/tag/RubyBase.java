package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class RubyBase implements Tag {
    private final Node node;

    public RubyBase(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.TEXT)) {
                stringBuilder.append(childNode.getTextContent());
            } else if (nodeName.equalsIgnoreCase(Element.BOLD)) {
                stringBuilder.append(new Bold(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.FIXED_CASE)) {
                stringBuilder.append(new FixedCase(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ITALIC)) {
                stringBuilder.append(new Italic(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.MONOSPACE)) {
                stringBuilder.append(new Monospace(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.OVERLINE)) {
                stringBuilder.append(new Overlined(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ROMAN)) {
                stringBuilder.append(new Roman(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SANS_SERIF)) {
                stringBuilder.append(new SansSerif(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SMALL_CAPS)) {
                stringBuilder.append(new SmallCaps(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.STRIKE)) {
                stringBuilder.append(new Strike(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.UNDERLINE)) {
                stringBuilder.append(new Underline(childNode).getElement());
            }
        }

        return TagUtils.addRbTag(stringBuilder.toString());
    }
}
