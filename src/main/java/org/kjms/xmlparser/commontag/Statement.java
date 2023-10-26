package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.group.OwnershipElements;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Statement implements Tag {
    private final Node node;

    public Statement(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.LABEL)) {
                stringBuilder.append(new Label(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TITLE)) {
                stringBuilder.append(new Title(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ABSTRACT)) {
                stringBuilder.append(new ElementAbstract(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.KEYWORD_GROUP)) {
                stringBuilder.append(new KeywordGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SUBJECT_GROUP)) {
                stringBuilder.append(new SubjectGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PARAGRAPH)) {
                stringBuilder.append(new Paragraph(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.STATEMENT)) {
                stringBuilder.append(new Statement(childNode).getElement());
            } else if (Element.OWNERSHIP_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new OwnershipElements(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
