package org.kjms.xmlparser.article;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.article.front.Front;
import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.utils.NodeUtils;
import org.w3c.dom.Node;

public class Article implements Tag {

    private final Node node;

    public Article(Node node) {
        this.node = node;
    }

    public String getElement() {

        Front front = new Front(NodeUtils.getNode(node, Element.FRONT));

//        Back back = new Back(NodeUtils.getNode(node, ArticleElement.BACK));

//        Body body = new Body(NodeUtils.getNode(node, ArticleElement.BODY));

        return String.format("<body style=overflow-x:hidden;margin:0;> %s </body>", front.getElement());

    }
}
