package org.kjms.xmlparser.article.back.sec;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class BackSec implements Tag {

    private final Node node;

    public BackSec(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {
            Tag tag = null;

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.TITLE)) {
                tag = new BackSecTitle(childNode);
            } else if (nodeName.equalsIgnoreCase(Element.PARAGRAPH)) {
                tag = new BackSecP(childNode);
            } else if (nodeName.equalsIgnoreCase(Element.SECTION)) {
                tag = new BackSec(childNode);
            }

            if (tag != null) {
                stringBuilder.append(tag.getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
