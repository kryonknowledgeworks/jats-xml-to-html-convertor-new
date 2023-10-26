package org.kjms.xmlparser.commontag.group;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.ExternalLink;
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

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.EMAIL)) {
                stringBuilder.append(TagUtils.addLabelTag(childNode.getTextContent()));
            } else if (nodeName.equalsIgnoreCase(Element.EXT_LINK)) {
                stringBuilder.append(new ExternalLink(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.URI)) {

                Map<String, String> map = Map.of("xlink:href", childNode.getTextContent());

                stringBuilder.append(TagUtils.addATag(map, childNode.getTextContent()));
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
