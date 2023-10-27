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

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.FOOTNOTE)) {
                stringBuilder.append(new Footnote(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TARGET)) {
                stringBuilder.append(new Target(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CROSS_REFERENCE)) {
                stringBuilder.append(new Xref(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
