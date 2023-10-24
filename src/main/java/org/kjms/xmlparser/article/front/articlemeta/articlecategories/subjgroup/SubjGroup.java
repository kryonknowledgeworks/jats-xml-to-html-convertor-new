package org.kjms.xmlparser.article.front.articlemeta.articlecategories.subjgroup;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.NodeUtils;
import org.w3c.dom.Node;

import java.util.List;

public class SubjGroup implements Tag {
    private final Node node;

    public SubjGroup(Node node) {
        this.node = node;
    }

    public String getElement() {

        List<Node> subjects = NodeUtils.getNodes(node, Element.SUBJECT);

        return "";
    }
}
