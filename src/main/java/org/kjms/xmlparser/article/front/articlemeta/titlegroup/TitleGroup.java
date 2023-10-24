package org.kjms.xmlparser.article.front.articlemeta.titlegroup;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.NodeUtils;
import org.w3c.dom.Node;

import java.util.List;

public class TitleGroup implements Tag {
    private final Node node;

    public TitleGroup(Node node) {
        this.node = node;
    }

    public String getElement() {
        List<Node> articleTitles = NodeUtils.getNodes(node, Element.ARTICLE_TITLE);

        return "";
    }
}
