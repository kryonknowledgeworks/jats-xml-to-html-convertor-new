package org.kjms.xmlparser.article.front.articlemeta.contribgroup.contrib;

import org.kjms.xmlparser.Tag;
import org.w3c.dom.Node;

import java.util.List;

public class Xref implements Tag {
    private final List<Node> nodes;
    public Xref(List<Node> nodes) {
        this.nodes = nodes;
    }
    public String getElement() {
        return "";
    }
}
