package org.kjms.xmlparser.article.front.articlemeta.contribgroup.contrib;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;


import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;


public class Contrib implements Tag {

    private final Node node;

    public Contrib(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.XREF)) {
                stringBuilder.append(new ContribXref(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.NAME)) {
                stringBuilder.append(new ContribName(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
