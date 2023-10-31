package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Table implements Tag {
    private final Node node;

    public Table(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.COLUMN)) {
                stringBuilder.append(new Column(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.COLUMN_GROUP)) {
                stringBuilder.append(new ColumnGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.T_HEADER)) {
                stringBuilder.append(new THead(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.T_BODY)) {
                stringBuilder.append(new TBody(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.T_FOOT)) {
                stringBuilder.append(new TFoot(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TABLE_ROW)) {
                stringBuilder.append(new TableRow(childNode).getElement());
            }
        }

        return TagUtils.addTableTag(stringBuilder.toString());
    }
}
