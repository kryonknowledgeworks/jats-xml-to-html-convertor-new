package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class License implements Tag {
    private final Node node;

    public License(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.ALI_LICENSE_REFERENCE)) {
                stringBuilder.append(new AliLicenseReference(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.LICENSE_PARAGRAPH)) {
                stringBuilder.append(new LicenseParagraph(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
