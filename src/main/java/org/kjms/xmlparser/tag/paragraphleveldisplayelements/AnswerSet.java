package org.kjms.xmlparser.tag.paragraphleveldisplayelements;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.tag.*;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class AnswerSet implements Tag {
    private final Node node;

    public AnswerSet(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.OBJECT_ID)) {
                stringBuilder.append(new ObjectId(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.LABEL)) {
                stringBuilder.append(new Label(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TITLE)) {
                stringBuilder.append(new Title(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SUBTITLE)) {
                stringBuilder.append(new SubTitle(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ALTERNATE_TITLE)) {
                stringBuilder.append(new AlternateTitle(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ANSWER)) {
                stringBuilder.append(new Answer(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PARAGRAPH)) {
                stringBuilder.append(new Paragraph(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.EXPLANATION)) {
                stringBuilder.append(new Explanation(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
