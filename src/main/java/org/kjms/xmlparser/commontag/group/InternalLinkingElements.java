package org.kjms.xmlparser.commontag.group;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.Footnote;
import org.kjms.xmlparser.commontag.Target;
import org.kjms.xmlparser.commontag.Xref;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class InternalLinkingElements implements Tag {
    private final Node node;

    public InternalLinkingElements(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        final String nodeName = node.getNodeName();

        if (nodeName.equalsIgnoreCase(Element.FOOTNOTE)) {
            stringBuilder.append(new Footnote(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.TARGET)) {
            stringBuilder.append(new Target(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.CROSS_REFERENCE)) {
            stringBuilder.append(new Xref(node).getElement());
        }

        return stringBuilder.toString();
    }
}
