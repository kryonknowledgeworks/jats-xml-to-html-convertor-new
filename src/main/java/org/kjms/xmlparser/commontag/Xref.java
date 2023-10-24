package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.article.front.articlemeta.ArticleId;
import org.kjms.xmlparser.article.front.articlemeta.articlecategories.ArticleCategories;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Xref implements Tag {
    private final Node node;

    public Xref(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.SUPER_SCRIPTS)) {
                stringBuilder.append(TagUtils.addLabelTag(childNode.getTextContent()));
            }
        }

        return stringBuilder.toString();
    }
}
