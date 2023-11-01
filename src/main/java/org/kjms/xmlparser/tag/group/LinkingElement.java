package org.kjms.xmlparser.tag.group;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.tag.Email;
import org.kjms.xmlparser.tag.ExternalLink;
import org.kjms.xmlparser.tag.UriElement;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

import java.util.Map;

public class LinkingElement implements Tag {
    private final Node node;

    public LinkingElement(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        final String nodeName = node.getNodeName();

        if (nodeName.equalsIgnoreCase(Element.EMAIL)) {
            stringBuilder.append(new Email(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.EXT_LINK)) {
            stringBuilder.append(new ExternalLink(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.URI)) {
            stringBuilder.append(new UriElement(node).getElement());
        }

        return stringBuilder.toString();
    }
}
