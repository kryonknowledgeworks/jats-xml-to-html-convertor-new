package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.group.CitationElements;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Reference implements Tag {
    private final Node node;

    public Reference(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.LABEL)) {
                stringBuilder.append(new Label(childNode).getElement());
            } else if (Element.CITATION_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new CitationElements(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.NOTE)) {
                stringBuilder.append(new Note(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
