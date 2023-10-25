package org.kjms.xmlparser.commontag.citationelements;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class CitationElements implements Tag {
    private final Node node;

    public CitationElements(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.CITATION_ALTERNATIVES)) {
                stringBuilder.append(new CitationAlternatives(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ELEMENT_CITATION)) {
                stringBuilder.append(new ElementCitation(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.MIXED_CITATION)) {
                stringBuilder.append(new MixedCitation(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.NLM_CITATION)) {
                stringBuilder.append(new NlmCitation(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
