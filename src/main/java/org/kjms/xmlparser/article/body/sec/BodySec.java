package org.kjms.xmlparser.article.body.sec;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.NodeUtils;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

import java.util.List;

public class BodySec implements Tag {

    private final Node node;

    public BodySec(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.LABEL)) {
                stringBuilder.append(new BodySecLabel(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TITLE)) {
                stringBuilder.append(new BodySecTitle(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PARAGRAPH)) {
                stringBuilder.append(new BodySecP(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SEC)) {
                stringBuilder.append(new BodySec(childNode).getElement());
            }
        }

        return TagUtils.addSectionTag(stringBuilder.toString());
    }

}
