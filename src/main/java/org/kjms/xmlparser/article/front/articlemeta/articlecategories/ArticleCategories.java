package org.kjms.xmlparser.article.front.articlemeta.articlecategories;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.article.front.articlemeta.articlecategories.subjgroup.SubjGroup;
import org.kjms.xmlparser.utils.NodeUtils;
import org.w3c.dom.Node;

public class ArticleCategories implements Tag {

    private Node node;

    public ArticleCategories(Node node) {
        this.node = node;
    }

    public String getElement() {

        SubjGroup subjGroup = new SubjGroup(NodeUtils.getNode(node, Element.SUBJ_GROUP));

        return subjGroup.getElement();
    }
}
