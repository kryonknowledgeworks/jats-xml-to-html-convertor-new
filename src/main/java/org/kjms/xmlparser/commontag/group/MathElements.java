package org.kjms.xmlparser.commontag.group;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;

import org.kjms.xmlparser.commontag.MathElement;

import org.kjms.xmlparser.commontag.TexMath;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class MathElements implements Tag {
    private final Node node;

    public MathElements(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.TEX_MATH_EQUATION)) {
                stringBuilder.append(new TexMath(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.MATH)) {
                stringBuilder.append(new MathElement(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}