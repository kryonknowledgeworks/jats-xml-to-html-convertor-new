package org.kjms.xmlparser.tag.paragraphleveldisplayelements;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.tag.*;
import org.kjms.xmlparser.tag.group.*;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class ArrayElement implements Tag {
    private final Node node;

    public ArrayElement(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (Element.ACCESSIBILITY_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new AccessibilityElements(childNode).getElement());
            } else if (Element.LINKING_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new LinkingElement(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ALTERNATIVES)) {
                stringBuilder.append(new Alternatives(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.GRAPHIC)) {
                stringBuilder.append(new Graphic(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.MEDIA)) {
                stringBuilder.append(new Media(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.T_BODY)) {
                stringBuilder.append(new TBody(childNode).getElement());
            } else if (Element.OWNERSHIP_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new OwnershipElements(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
