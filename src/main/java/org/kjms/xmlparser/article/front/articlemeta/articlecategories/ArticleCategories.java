package org.kjms.xmlparser.article.front.articlemeta.articlecategories;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.article.front.articlemeta.ArticleId;
import org.kjms.xmlparser.article.front.articlemeta.articlecategories.subjgroup.SubjGroup;
import org.kjms.xmlparser.utils.NodeUtils;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class ArticleCategories implements Tag {

    private final Node node;

    public ArticleCategories(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.SUBJ_GROUP)) {
                stringBuilder.append(new SubjGroup(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
