package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
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
            } else if (nodeName.equalsIgnoreCase(Element.COLLABORATIVE)) {
                stringBuilder.append(new Collaborative(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ARTICLE_TITLE)) {
                stringBuilder.append(new ArticleTitle(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TRANS_TITLE)) {
                stringBuilder.append(new TranslatedTitle(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SOURCE)) {
                stringBuilder.append(new Source(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PATENT)) {
                stringBuilder.append(new Patent(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TRANS_SOURCE)) {
                stringBuilder.append(new TranslatedSource(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.YEAR)) {
                stringBuilder.append(new Year(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.MONTH)) {
                stringBuilder.append(new Month(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.DAY)) {
                stringBuilder.append(new Day(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TIME_STAMP)) {
                stringBuilder.append(new TimeStamp(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SEASON)) {
                stringBuilder.append(new Season(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ACCESS_DATE)) {
                stringBuilder.append(new AccessDate(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.VOLUME)) {
                stringBuilder.append(new Volume(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.EDITION)) {
                stringBuilder.append(new Edition(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CONFERENCE_NAME)) {
                stringBuilder.append(new ConferenceName(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CONFERENCE_DATE)) {
                stringBuilder.append(new ConferenceDate(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CONFERENCE_LOCATION)) {
                stringBuilder.append(new ConferenceLocation(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ISSUE)) {
                stringBuilder.append(new Issue(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SUPPLEMENT)) {
                stringBuilder.append(new Supplement(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PUBLISHER_LOCATION)) {
                stringBuilder.append(new PublisherLocation(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PUBLISHER_NAME)) {
                stringBuilder.append(new PublisherName(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.FPAGE)) {
                stringBuilder.append(new FirstPage(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.LPAGE)) {
                stringBuilder.append(new LastPage(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PAGE_COUNT)) {
                stringBuilder.append(new PageCount(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SERIES)) {
                stringBuilder.append(new Series(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.COMMENT)) {
                stringBuilder.append(new Comment(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PUBLICATION_ID)) {
                stringBuilder.append(new PublisherId(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ANNOTATION)) {
                stringBuilder.append(new Annotation(childNode).getElement());
            }
        }

        return TagUtils.addSpanTag(stringBuilder.toString());
    }
}
