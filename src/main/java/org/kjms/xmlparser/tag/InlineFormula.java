package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.tag.group.*;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class InlineFormula implements Tag {
    private final Node node;


    public InlineFormula(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.TEXT)) {
                stringBuilder.append(TagUtils.addSpanTag(childNode.getTextContent()));
            } else if (Element.ACCESSIBILITY_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new AccessibilityElements(childNode).getElement());
            } else if (Element.EMPHASIS_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new EmphasisElements(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ALTERNATIVES)) {
                stringBuilder.append(new Alternatives(childNode).getElement());
            }  else if (Element.INLINE_DISPLAY_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new InlineDisplayElements(childNode).getElement());
            } else if (Element.INLINE_MATH_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new InlineMathElements(childNode).getElement());
            } else if (Element.MATH_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new MathElements(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.NAMED_CONTENT)) {
                stringBuilder.append(new NamedContent(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.STYLED_CONTENT)) {
                stringBuilder.append(new StyledContent(childNode).getElement());
            } else if (Element.BASELINE_CHANGE_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new BaselineChangeElements(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
