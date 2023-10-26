package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Speaker implements Tag {
    private final Node node;

    public Speaker(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.TEXT)) {
                stringBuilder.append(TagUtils.addSpanTag(childNode.getTextContent()));
            } else if (nodeName.equalsIgnoreCase(Element.DEGREES)) {
                stringBuilder.append(new Degrees(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.GIVEN_NAMES)) {
                stringBuilder.append(new GivenNames(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PREFIX)) {
                stringBuilder.append(new Prefix(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SURNAME)) {
                stringBuilder.append(new Surname(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SUFFIX)) {
                stringBuilder.append(new Suffix(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
