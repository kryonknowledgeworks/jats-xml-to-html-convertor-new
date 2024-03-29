package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.tag.group.BaselineChangeElements;
import org.kjms.xmlparser.tag.group.EmphasisElements;
import org.kjms.xmlparser.tag.group.InlineDisplayElements;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Standard implements Tag {
    private final Node node;

    public Standard(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.TEXT)) {
                stringBuilder.append(TagUtils.addSpanTag(childNode.getTextContent()));
            } else if (Element.EMPHASIS_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new EmphasisElements(childNode).getElement());
            } else if (Element.INLINE_DISPLAY_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new InlineDisplayElements(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.NAMED_CONTENT)) {
                stringBuilder.append(new NamedContent(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.STYLED_CONTENT)) {
                stringBuilder.append(new StyledContent(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.DAY)) {
                stringBuilder.append(new Day(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.MONTH)) {
                stringBuilder.append(new Month(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PUBLICATION_ID)) {
                stringBuilder.append(new PublicationId(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SOURCE)) {
                stringBuilder.append(new Source(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.STANDARD_ORGANIZATION)) {
                stringBuilder.append(new StandardOrganization(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.YEAR)) {
                stringBuilder.append(new Year(childNode).getElement());
            } else if (Element.BASELINE_CHANGE_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new BaselineChangeElements(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
