package org.kjms.xmlparser.commontag.citation;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Citation implements Tag {
    private final Node node;

    public Citation(Node node) {
        this.node = node;
    }

    public String getElement() {

        final String nodeName = node.getNodeName();

        if (nodeName.equalsIgnoreCase(Element.NLM_CITATION)) {
            return new NlmCitation(node).getElement();
        }

        return "";
    }
}
