package org.kjms.xmlparser.article.front;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.article.front.articlemeta.ArticleMeta;
import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.utils.NodeUtils;
import org.w3c.dom.Node;

public class Front implements Tag {
    private final Node node;

    public Front(Node node){
        this.node = node;
    }

    public String getElement() {

        ArticleMeta articleMeta = new ArticleMeta(NodeUtils.getNode(node, Element.ARTICLE_META));

        return articleMeta.getElement();
    }
}
