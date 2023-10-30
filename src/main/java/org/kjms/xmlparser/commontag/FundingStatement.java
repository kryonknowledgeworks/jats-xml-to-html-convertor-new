package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.group.BaselineChangeElements;
import org.kjms.xmlparser.commontag.group.EmphasisElements;
import org.kjms.xmlparser.commontag.group.LinkingElement;
import org.kjms.xmlparser.commontag.paragraphleveldisplayelements.ArrayElement;
import org.kjms.xmlparser.commontag.paragraphleveldisplayelements.Code;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class FundingStatement implements Tag {
    private final Node node;

    public FundingStatement(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.TEXT)) {
                stringBuilder.append(childNode.getTextContent());
            } else if (Element.LINKING_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new LinkingElement(childNode).getElement());
            } else if (Element.EMPHASIS_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new EmphasisElements(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.NAMED_SPECIAL_CONTENT)) {
                stringBuilder.append(new NamedSpecialContent(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.STYLED_SPECIAL_CONTENT)) {
                stringBuilder.append(new StyledSpecialContent(childNode).getElement());
            } else if (Element.BASELINE_CHANGE_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new BaselineChangeElements(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}