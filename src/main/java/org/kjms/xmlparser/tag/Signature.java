package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.tag.group.BaselineChangeElements;
import org.kjms.xmlparser.tag.group.EmphasisElements;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Signature implements Tag {
    private final Node node;

    public Signature(Node node) {
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
            } else if (Element.BASELINE_CHANGE_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new BaselineChangeElements(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.NAMED_CONTENT)) {
                stringBuilder.append(new NamedContent(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.STYLED_CONTENT)) {
                stringBuilder.append(new StyledContent(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.BREAK)) {
                stringBuilder.append(new BreakLine(childNode).getElement());
            } else if (Element.INLINE_DISPLAY_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new BaselineChangeElements(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.GRAPHIC)) {
                stringBuilder.append(new Graphic(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.MEDIA)) {
                stringBuilder.append(new Media(childNode).getElement());
            }
        }

        return stringBuilder.toString();
    }
}
