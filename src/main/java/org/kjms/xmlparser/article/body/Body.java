package org.kjms.xmlparser.article.body;

import org.kjms.xmlparser.Tag;
import org.w3c.dom.Node;

public class Body implements Tag {
    private Node node;

    public Body(Node node){
        this.node = node;
    }

    public String getElement() {
        return "";
    }
}
