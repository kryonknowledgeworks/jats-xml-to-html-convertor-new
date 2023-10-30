package org.kjms.xmlparser.commontag.group;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.CitationAlternatives;
import org.kjms.xmlparser.commontag.ElementCitation;
import org.kjms.xmlparser.commontag.MixedCitation;
import org.kjms.xmlparser.commontag.NlmCitation;
import org.w3c.dom.Node;

public class CitationElements implements Tag {
    private final Node node;

    public CitationElements(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        final String nodeName = node.getNodeName();

        if (nodeName.equalsIgnoreCase(Element.CITATION_ALTERNATIVES)) {
            stringBuilder.append(new CitationAlternatives(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.ELEMENT_CITATION)) {
            stringBuilder.append(new ElementCitation(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.MIXED_CITATION)) {
            stringBuilder.append(new MixedCitation(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.NLM_CITATION)) {
            stringBuilder.append(new NlmCitation(node).getElement());
        }

        return stringBuilder.toString();
    }
}
