package org.kjms.xmlparser.article.back.reflist.ref;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.citationelements.CitationElements;
import org.w3c.dom.Node;

public class RefCitationElements implements Tag {
    private final Node node;

    public RefCitationElements(Node node) {
        this.node = node;
    }

    public String getElement() {
        return new CitationElements(node).getElement();
    }
}
