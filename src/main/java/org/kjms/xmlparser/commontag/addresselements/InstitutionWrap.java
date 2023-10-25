package org.kjms.xmlparser.commontag.addresselements;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class InstitutionWrap implements Tag {
    private final Node node;

    public InstitutionWrap(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.INSTITUTION)) {
                stringBuilder.append(new Institution(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.INSTITUTION_ID)) {
                stringBuilder.append(new InstitutionId(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
