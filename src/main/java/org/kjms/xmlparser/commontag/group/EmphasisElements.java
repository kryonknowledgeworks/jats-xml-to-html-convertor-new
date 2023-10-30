package org.kjms.xmlparser.commontag.group;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.*;
import org.w3c.dom.Node;

public class EmphasisElements implements Tag {
    private final Node node;

    public EmphasisElements(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        final String nodeName = node.getNodeName();

        if (nodeName.equalsIgnoreCase(Element.BOLD)) {
            stringBuilder.append(new Bold(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.FIXED_CASE)) {
            stringBuilder.append(new FixedCase(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.ITALIC)) {
            stringBuilder.append(new Italic(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.MONOSPACE_TEXT)) {
            stringBuilder.append(new Monospace(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.OVERLINE)) {
            stringBuilder.append(new Overlined(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.ROMAN)) {
            stringBuilder.append(new Roman(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.SANS_SERIF)) {
            stringBuilder.append(new SansSerif(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.SMALL_CAPS)) {
            stringBuilder.append(new SmallCaps(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.STRIKE)) {
            stringBuilder.append(new Strike(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.UNDERLINE)) {
            stringBuilder.append(new Underline(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.RUBY)) {
            stringBuilder.append(new Ruby(node).getElement());
        }

        return stringBuilder.toString();
    }
}
