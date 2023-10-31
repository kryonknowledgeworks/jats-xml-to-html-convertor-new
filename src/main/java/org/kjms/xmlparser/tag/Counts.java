package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Counts implements Tag {
    private final Node node;

    public Counts(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.COUNT)) {
                stringBuilder.append(new Count(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.FIGURE_COUNT)) {
                stringBuilder.append(new FigureCount(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TABLE_COUNT)) {
                stringBuilder.append(new TableCount(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.EQUATION_COUNT)) {
                stringBuilder.append(new EquationCount(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.REFERENCE_COUNT)) {
                stringBuilder.append(new ReferenceCount(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PAGE_COUNT)) {
                stringBuilder.append(new PageCount(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.WORD_COUNT)) {
                stringBuilder.append(new WordCount(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
