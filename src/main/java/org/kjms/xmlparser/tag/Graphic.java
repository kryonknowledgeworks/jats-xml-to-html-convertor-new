package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.tag.*;
import org.kjms.xmlparser.tag.group.AccessibilityElements;
import org.kjms.xmlparser.tag.group.LinkingElement;
import org.kjms.xmlparser.tag.group.OwnershipElements;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Graphic implements Tag {
    private final Node node;

    public Graphic(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (Element.ACCESSIBILITY_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new AccessibilityElements(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ABSTRACT)) {
                stringBuilder.append(new AbstractElement(childNode).getElement());
            } else if (Element.LINKING_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new LinkingElement(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CAPTION)) {
                stringBuilder.append(new Caption(childNode).getElement());
            } else if (Element.OWNERSHIP_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new OwnershipElements(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.OBJECT_ID)) {
                stringBuilder.append(new ObjectId(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.LABEL)) {
                stringBuilder.append(new Label(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.KEYWORD_GROUP)) {
                stringBuilder.append(new KeywordGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SUBJECT_GROUP)) {
                stringBuilder.append(new SubjectGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CROSS_REFERENCE)) {
                stringBuilder.append(new Xref(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
