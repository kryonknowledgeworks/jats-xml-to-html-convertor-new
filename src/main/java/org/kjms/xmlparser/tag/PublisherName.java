package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class PublisherName implements Tag {
    private final Node node;

    public PublisherName(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.TEXT)) {
                stringBuilder.append(TagUtils.addSpanTag(childNode.getTextContent()));
            } else if (nodeName.equalsIgnoreCase(Element.INSTITUTION)) {
                stringBuilder.append(new Institution(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.INSTITUTION_WRAPPER)) {
                stringBuilder.append(new InstitutionWrapper(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
