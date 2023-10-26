package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.Comment;
import org.kjms.xmlparser.commontag.PersonGroup;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class NlmCitation implements Tag {
    private final Node node;

    public NlmCitation(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.PERSON_GROUP)) {
                stringBuilder.append(new PersonGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ARTICLE_TITLE)) {
                stringBuilder.append(TagUtils.addLabelTag(childNode.getTextContent()));
            } else if (nodeName.equalsIgnoreCase(Element.SOURCE)) {
                stringBuilder.append(TagUtils.addLabelTag(childNode.getTextContent()));
            } else if (nodeName.equalsIgnoreCase(Element.YEAR)) {
                stringBuilder.append(TagUtils.addLabelTag(childNode.getTextContent()));
            } else if (nodeName.equalsIgnoreCase(Element.VOLUME)) {
                stringBuilder.append(TagUtils.addLabelTag(childNode.getTextContent()));
            } else if (nodeName.equalsIgnoreCase(Element.ISSUE)) {
                stringBuilder.append(TagUtils.addLabelTag(childNode.getTextContent()));
            } else if (nodeName.equalsIgnoreCase(Element.FPAGE)) {
                stringBuilder.append(TagUtils.addLabelTag(childNode.getTextContent()));
            } else if (nodeName.equalsIgnoreCase(Element.LPAGE)) {
                stringBuilder.append(TagUtils.addLabelTag(childNode.getTextContent()));
            } else if (nodeName.equalsIgnoreCase(Element.COMMENT)) {
                stringBuilder.append(new Comment(childNode).getElement());
            }
        }

        return stringBuilder.toString();
    }
}
