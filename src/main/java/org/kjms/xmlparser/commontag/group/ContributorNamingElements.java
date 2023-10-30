package org.kjms.xmlparser.commontag.group;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.Anonymous;
import org.kjms.xmlparser.commontag.Collaborative;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class ContributorNamingElements implements Tag {
    private final Node node;

    public ContributorNamingElements(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        final String nodeName = node.getNodeName();

        if (nodeName.equalsIgnoreCase(Element.ANONYMOUS)) {
            stringBuilder.append(new Anonymous(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.COLLABORATIVE)) {
            stringBuilder.append(new Collaborative(node).getElement());
        }

        return stringBuilder.toString();
    }
}
