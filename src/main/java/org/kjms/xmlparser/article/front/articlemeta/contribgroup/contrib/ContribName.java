package org.kjms.xmlparser.article.front.articlemeta.contribgroup.contrib;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.Name;
import org.w3c.dom.Node;

import java.util.List;

public class ContribName implements Tag {
    private final Node node;

    public ContribName(Node node) {
        this.node = node;
    }

    public String getElement() {
        return new Name(node).getElement();
    }
}
