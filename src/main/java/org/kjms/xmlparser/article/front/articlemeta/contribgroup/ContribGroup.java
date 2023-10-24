package org.kjms.xmlparser.article.front.articlemeta.contribgroup;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.article.front.articlemeta.ArticleId;
import org.kjms.xmlparser.article.front.articlemeta.articlecategories.ArticleCategories;
import org.kjms.xmlparser.article.front.articlemeta.authornotes.corresp.Corresp;
import org.kjms.xmlparser.article.front.articlemeta.contribgroup.aff.Aff;
import org.kjms.xmlparser.article.front.articlemeta.contribgroup.contrib.Contrib;
import org.kjms.xmlparser.utils.NodeUtils;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class ContribGroup implements Tag {
    private final Node node;

    public ContribGroup(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.CONTRIB)) {
                stringBuilder.append(new Contrib(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.AFF)) {
                stringBuilder.append(new Aff(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
