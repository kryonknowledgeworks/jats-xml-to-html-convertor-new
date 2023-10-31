package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.tag.group.BaselineChangeElements;
import org.kjms.xmlparser.tag.group.EmphasisElements;
import org.kjms.xmlparser.tag.group.RelatedMaterialElements;
import org.kjms.xmlparser.tag.group.InlineDisplayElements;
import org.kjms.xmlparser.tag.group.InlineMathElements;
import org.kjms.xmlparser.tag.group.InternalLinkingElements;
import org.kjms.xmlparser.tag.group.LinkingElement;
import org.kjms.xmlparser.tag.group.MathElements;
import org.kjms.xmlparser.tag.group.OtherInlineElements;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class SubTitle implements Tag {
    private final Node node;

    public SubTitle(Node node) {
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
            } else if (Element.RELATED_MATERIAL_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new RelatedMaterialElements(childNode).getElement());
            } else if (Element.EMPHASIS_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new EmphasisElements(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ALTERNATIVES)) {
                stringBuilder.append(new Alternatives(childNode).getElement());
            } else if (Element.INLINE_DISPLAY_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new InlineDisplayElements(childNode).getElement());
            } else if (Element.INLINE_MATH_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new InlineMathElements(childNode).getElement());
            } else if (Element.MATH_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new MathElements(childNode).getElement());
            } else if (Element.OTHER_INLINE_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new OtherInlineElements(childNode).getElement());
            } else if (Element.INTERNAL_LINKING_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new InternalLinkingElements(childNode).getElement());
            } else if (Element.BASELINE_CHANGE_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new BaselineChangeElements(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.BREAK)) {
                stringBuilder.append(new BreakLine(childNode).getElement());
            }
        }

        return TagUtils.addBTag(stringBuilder.toString());
    }
}
