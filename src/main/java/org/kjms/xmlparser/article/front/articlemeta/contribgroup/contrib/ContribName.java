package org.kjms.xmlparser.article.front.articlemeta.contribgroup.contrib;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.name.Name;
import org.w3c.dom.Node;

public class ContribName implements Tag {
    private final Node node;

    public ContribName(Node node) {
        this.node = node;
    }

    public String getElement() {
        return new Name(node).getElement();
    }
}
