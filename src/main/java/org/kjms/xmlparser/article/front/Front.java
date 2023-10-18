package org.kjms.xmlparser.article.front;

import org.kjms.xmlparser.Tag;
import org.w3c.dom.Node;

public class Front implements Tag {
    private Node node;

    private String html;

    public Front(Node node){
        this.node = node;
    }

    public String getElement() {



        return html;
    }
}
