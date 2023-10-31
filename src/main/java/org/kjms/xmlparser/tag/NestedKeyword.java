package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class NestedKeyword implements Tag {
    private final Node node;

    public NestedKeyword(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.KEYWORD)) {
                stringBuilder.append(new Keyword(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.COMPOUND_KEYWORD)) {
                stringBuilder.append(new CompoundKeyword(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.NESTED_KEYWORD)) {
                stringBuilder.append(new NestedKeyword(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
