package org.kjms.xmlparser.article.body.sec;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.Paragraph;
import org.w3c.dom.Node;

public class BodySecP extends Paragraph implements Tag {

    public BodySecP(Node node) {
        super(node);
    }

    public String getElement() {
        return super.getElement();
    }
}
