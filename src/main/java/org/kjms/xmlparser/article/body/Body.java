package org.kjms.xmlparser.article.body;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.article.body.sec.BodySec;
import org.kjms.xmlparser.utils.NodeUtils;
import org.w3c.dom.Node;

public class Body implements Tag {
    private Node node;

    public Body(Node node){
        this.node = node;
    }

    public String getElement() {
        BodySec bodySec = new BodySec(NodeUtils.getNodes(node, Element.SEC));
        return "";
    }
}
