package org.kjms.xmlparser.article.back.sec;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.Paragraph;

import org.w3c.dom.Node;

public class BackSecP extends Paragraph implements Tag {
    private final Node node;

    public BackSecP(Node node) {
        super(node);
        this.node = node;
    }

    public String getElement() {
        return super.getElement();
    }
}
