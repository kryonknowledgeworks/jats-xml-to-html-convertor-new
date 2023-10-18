package org.kjms.xmlparser.article;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.article.back.Back;
import org.kjms.xmlparser.article.body.Body;
import org.kjms.xmlparser.article.front.Front;
import org.kjms.xmlparser.elements.ArticleElement;
import org.kjms.xmlparser.utils.NodeUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Article implements Tag {

    private final Node node;

    public Article(Node node) {
        this.node = node;
    }

    public String getElement() {

        Front front = new Front(NodeUtils.getNode(node, ArticleElement.FRONT));

        Back back = new Back(NodeUtils.getNode(node, ArticleElement.BACK));

        Body body = new Body(NodeUtils.getNode(node, ArticleElement.BODY));

        return String.format("<body style=overflow-x:hidden;margin:0;> %s </body>", front.getElement() + body.getElement() + back.getElement());
    }
}
