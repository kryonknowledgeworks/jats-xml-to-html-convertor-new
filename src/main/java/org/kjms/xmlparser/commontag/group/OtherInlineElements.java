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

        final String nodeName = node.getNodeName();

        if (nodeName.equalsIgnoreCase(Element.ABBREVIATION)) {
            stringBuilder.append(new Abbreviation(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.INDEX_TERM)) {
            stringBuilder.append(new IndexTerm(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.INDEX_TERM_RANGE_END)) {
            stringBuilder.append(new IndexTermRangeEnd(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.MILESTONE_END)) {
            stringBuilder.append(new MilestoneEnd(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.MILESTONE_START)) {
            stringBuilder.append(new MilestoneStart(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.NAMED_SPECIAL_CONTENT)) {
            stringBuilder.append(new NamedSpecialContent(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.STYLED_SPECIAL_CONTENT)) {
            stringBuilder.append(new StyledSpecialContent(node).getElement());
        }

        return stringBuilder.toString();
    }
}
