package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Permissions implements Tag {
    private final Node node;

    public Permissions(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.COPYRIGHT_STATEMENT)) {
                stringBuilder.append(new CopyrightStatement(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.COPYRIGHT_YEAR)) {
                stringBuilder.append(new CopyrightYear(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.COPYRIGHT_HOLDER)) {
                stringBuilder.append(new CopyrightHolder(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ALI_FREE_TO_READ)) {
                stringBuilder.append(new AliFreeToRead(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.LICENSE)) {
                stringBuilder.append(new License(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
