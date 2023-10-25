package org.kjms.xmlparser.commontag.emphasiselements;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.linkingelements.LinkingElement;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class SmallCaps implements Tag {
    private final Node node;

    public SmallCaps(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.TEXT)) {
                stringBuilder.append(TagUtils.addSpanTag(node.getTextContent(), "font-variant: small-caps;"));
            } else if (Element.LINKING_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new LinkingElement(childNode).getElement());
            } else if (Element.EMPHASIS_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new EmphasisElements(childNode).getElement());
            }

            // todo: Other elements needs to add
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
