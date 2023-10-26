package org.kjms.xmlparser.commontag.group;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.ChemicalStructure;
import org.kjms.xmlparser.commontag.InlineFormula;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class InlineMathElements implements Tag {
    private final Node node;

    public InlineMathElements(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.CHEMICAL_STRUCTURE)) {
                stringBuilder.append(new ChemicalStructure(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.INLINE_FORMULA)) {
                stringBuilder.append(new InlineFormula(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
