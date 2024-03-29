package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class TableRow implements Tag {
    private final Node node;

    public TableRow(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.TABLE_HEADER)) {
                stringBuilder.append(new TableHeader(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TABLE_DATA)) {
                stringBuilder.append(new TableData(childNode).getElement());
            }
        }

        return TagUtils.addTrTag(stringBuilder.toString());
    }
}
