package org.kjms.xmlparser.article.front.articlemeta.articlecategories.subjgroup;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Subject implements Tag {
    private final Node node;

    public Subject(Node node) {
        this.node = node;
    }

    public String getElement() {
        return TagUtils.addLabelTag(node.getTextContent());
    }
}
