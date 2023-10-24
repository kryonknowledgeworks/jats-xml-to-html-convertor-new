package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.article.back.reflist.RefList;
import org.kjms.xmlparser.article.back.reflist.RefListTitle;
import org.kjms.xmlparser.article.back.reflist.ref.Ref;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Name implements Tag {

    private final Node node;

    public Name(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.SURNAME) || nodeName.equalsIgnoreCase(Element.GIVEN_NAMES)) {
                stringBuilder.append(TagUtils.addLabelTag(nodeName));
            }
        }

        return stringBuilder.toString();
    }
}
