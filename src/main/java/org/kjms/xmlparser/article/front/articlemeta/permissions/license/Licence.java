package org.kjms.xmlparser.article.front.articlemeta.permissions.license;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.article.front.articlemeta.permissions.license.licensep.LicenseP;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Licence implements Tag {
    private final Node node;

    public Licence(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.LICENSE_PARAGRAPH)) {
                stringBuilder.append(new LicenseP(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
