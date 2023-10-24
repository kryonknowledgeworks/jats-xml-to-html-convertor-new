package org.kjms.xmlparser.article.front.articlemeta.contribgroup.contrib;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.Xref;
import org.w3c.dom.Node;

import java.util.List;

public class ContribXref implements Tag {
    private final Node node;

    public ContribXref(Node node) {
        this.node = node;
    }

    public String getElement() {
        return new Xref(node).getElement();
    }
}
