package org.kjms.xmlparser.article.back.reflist.ref;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.citation.Citation;
import org.w3c.dom.Node;

public class RefCitation extends Citation implements Tag {
    public RefCitation(Node node) {
        super(node);
    }

    public String getElement() {
        return super.getElement();
    }
}
