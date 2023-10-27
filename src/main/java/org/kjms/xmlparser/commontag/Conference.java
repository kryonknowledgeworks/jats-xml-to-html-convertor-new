package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Conference implements Tag {
    private final Node node;

    public Conference(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.CONFERENCE_DATE)) {
                stringBuilder.append(new ConferenceDate(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CONFERENCE_NAME)) {
                stringBuilder.append(new ConferenceName(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CONFERENCE_ACRONYM)) {
                stringBuilder.append(new ConferenceAcronym(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CONFERENCE_NUMBER)) {
                stringBuilder.append(new ConferenceNumber(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CONFERENCE_LOCATION)) {
                stringBuilder.append(new ConferenceLocation(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CONFERENCE_SPONSOR)) {
                stringBuilder.append(new ConferenceSponsor(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CONFERENCE_THEME)) {
                stringBuilder.append(new ConferenceTheme(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
