package org.kjms.xmlparser.commontag.group;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.*;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class OtherInlineElements implements Tag {
    private final Node node;

    public OtherInlineElements(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.ABBREVIATION)) {
                stringBuilder.append(new Abbreviation(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.INDEX_TERM)) {
                stringBuilder.append(new IndexTerm(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.INDEX_TERM_RANGE_END)) {
                stringBuilder.append(new IndexTermRangeEnd(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.MILESTONE_END)) {
                stringBuilder.append(new MilestoneEnd(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.MILESTONE_START)) {
                stringBuilder.append(new MilestoneStart(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.NAMED_SPECIAL_CONTENT)) {
                stringBuilder.append(new NamedSpecialContent(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.STYLED_SPECIAL_CONTENT)) {
                stringBuilder.append(new StyledSpecialContent(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
