package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class BlockAlternatives implements Tag {
    private final Node node;

    public BlockAlternatives(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.OBJECT_ID)) {
                stringBuilder.append(new ObjectId(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.BOXED_TEXT)) {
                stringBuilder.append(new BoxedText(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.FIGURE)) {
                stringBuilder.append(new Figure(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.FIGURE_GROUP)) {
                stringBuilder.append(new FigureGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TABLE_WRAPPER)) {
                stringBuilder.append(new TableWrapper(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TABLE_WRAPPER_GROUP)) {
                stringBuilder.append(new TableWrapperGroup(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
