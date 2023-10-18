package org.kjms.xmlparser.article.back;

import org.kjms.xmlparser.Tag;
import org.w3c.dom.Node;

public class Back implements Tag {

    private Node node;

    public Back(Node node) {
        this.node = node;
    }

    public String getElement() {
        return "";
    }
}
