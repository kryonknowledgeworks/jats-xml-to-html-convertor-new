package org.kjms.xmlparser.commontag.group;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.SubsScript;
import org.kjms.xmlparser.commontag.SuperScript;
import org.w3c.dom.Node;

public class BaselineChangeElements implements Tag {
    private final Node node;

    public BaselineChangeElements(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        if (node.getNodeName().equalsIgnoreCase(Element.SUPERSCRIPT)) {
            stringBuilder.append(new SuperScript(node).getElement());
        } else if (node.getNodeName().equalsIgnoreCase(Element.SUBSCRIPT)) {
            stringBuilder.append(new SubsScript(node).getElement());
        }

        return stringBuilder.toString();
    }
}
