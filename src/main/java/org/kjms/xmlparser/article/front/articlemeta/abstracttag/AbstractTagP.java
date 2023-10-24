package org.kjms.xmlparser.article.front.articlemeta.abstracttag;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.Paragraph;
import org.w3c.dom.Node;

public class AbstractTagP extends Paragraph implements Tag {

    public AbstractTagP(Node node) {
        super(node);
    }

    public String getElement() {
        return super.getElement();
    }
}
