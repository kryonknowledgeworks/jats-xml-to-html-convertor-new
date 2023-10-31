package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class DefinitionList implements Tag {
    private final Node node;

    public DefinitionList(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.LABEL)) {
                stringBuilder.append(new Label(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TITLE)) {
                stringBuilder.append(new Title(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TERM_HEAD)) {
                stringBuilder.append(new TermHead(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.DEFINITION_HEAD)) {
                stringBuilder.append(new DefinitionHead(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.DEFINITION_ITEM)) {
                stringBuilder.append(new DefinitionItem(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.DEFINITION_LIST)) {
                stringBuilder.append(new DefinitionList(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
