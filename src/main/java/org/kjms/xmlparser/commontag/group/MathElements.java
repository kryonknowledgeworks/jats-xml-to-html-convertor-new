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

        final String nodeName = node.getNodeName();

        if (nodeName.equalsIgnoreCase(Element.TEX_MATH_EQUATION)) {
            stringBuilder.append(new TexMath(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.MATH)) {
            stringBuilder.append(new MathElement(node).getElement());
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
