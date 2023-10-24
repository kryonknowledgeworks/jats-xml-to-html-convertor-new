package org.kjms.xmlparser.article.front.articlemeta.authornotes;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.article.front.articlemeta.authornotes.corresp.Corresp;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class AuthorNotes implements Tag {
    private final Node node;

    public AuthorNotes(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.CORRESP)) {
                stringBuilder.append(new Corresp(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
