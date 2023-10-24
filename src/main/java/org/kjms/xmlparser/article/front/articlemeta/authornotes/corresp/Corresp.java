package org.kjms.xmlparser.article.front.articlemeta.authornotes.corresp;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.article.front.articlemeta.ArticleId;
import org.kjms.xmlparser.article.front.articlemeta.authornotes.AuthorNotesLinkingElements;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Corresp implements Tag {
    private final Node node;

    public Corresp(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (Element.LINKING_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new AuthorNotesLinkingElements(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
