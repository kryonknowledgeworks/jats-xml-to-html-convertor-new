package org.kjms.xmlparser.tag.group;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.tag.ChemicalStructure;
import org.kjms.xmlparser.tag.InlineFormula;
import org.w3c.dom.Node;

public class InlineMathElements implements Tag {
    private final Node node;

    public InlineMathElements(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        final String nodeName = node.getNodeName();

        if (nodeName.equalsIgnoreCase(Element.CHEMICAL_STRUCTURE)) {
            stringBuilder.append(new ChemicalStructure(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.INLINE_FORMULA)) {
            stringBuilder.append(new InlineFormula(node).getElement());
        }

        return stringBuilder.toString();
    }
}
