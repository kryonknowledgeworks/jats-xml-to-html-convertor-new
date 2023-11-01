package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.tag.group.*;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class EventDescription implements Tag {
    private final Node node;

    public EventDescription(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.TEXT)) {
                stringBuilder.append(TagUtils.addSpanTag(childNode.getTextContent()));
            } else if (Element.LINKING_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new LinkingElement(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ARTICLE_ID)) {
                stringBuilder.append(new ArticleId(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ISSN)) {
                stringBuilder.append(new Issn(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ISSN_LINKING)) {
                stringBuilder.append(new IssnL(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ISBN)) {
                stringBuilder.append(new Isbn(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ARTICLE_VERSION)) {
                stringBuilder.append(new ArticleVersion(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ARTICLE_VERSION_ALTERNATIVES)) {
                stringBuilder.append(new ArticleVersionAlternatives(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.DATE)) {
                stringBuilder.append(new Date(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.STRING_DATE)) {
                stringBuilder.append(new StringDate(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PUBLICATION_DATE)) {
                stringBuilder.append(new PublicationDate(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PUBLICATION_DATE_NOT_AVAILABLE)) {
                stringBuilder.append(new PublicationDateNotAvailable(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
