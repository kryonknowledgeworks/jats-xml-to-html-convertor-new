package org.kjms.xmlparser.article.front.articlemeta.permissions;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.article.front.articlemeta.ArticleId;
import org.kjms.xmlparser.article.front.articlemeta.articlecategories.ArticleCategories;
import org.kjms.xmlparser.article.front.articlemeta.permissions.license.Licence;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Permission implements Tag {
    private final Node node;

    public Permission(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.COPYRIGHT_STATEMENT)) {
                stringBuilder.append(TagUtils.addLabelTag(childNode.getTextContent()));
            } else if (nodeName.equalsIgnoreCase(Element.COPYRIGHT_YEAR)) {
                stringBuilder.append(TagUtils.addLabelTag(childNode.getTextContent()));
            } else if (nodeName.equalsIgnoreCase(Element.LICENSE)) {
                stringBuilder.append(new Licence(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
