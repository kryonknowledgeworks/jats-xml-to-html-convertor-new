package org.kjms.xmlparser.article.front;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.article.back.ack.Ack;
import org.kjms.xmlparser.article.back.reflist.RefList;
import org.kjms.xmlparser.article.back.sec.BackSec;
import org.kjms.xmlparser.article.front.articlemeta.ArticleMeta;
import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.utils.NodeUtils;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Front implements Tag {
    private final Node node;

    public Front(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.ARTICLE_META)) {
                stringBuilder.append(TagUtils.addDivTag(new ArticleMeta(childNode).getElement()));
            }

        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
