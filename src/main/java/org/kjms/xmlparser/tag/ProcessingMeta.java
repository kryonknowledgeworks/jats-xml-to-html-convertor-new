package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class ProcessingMeta implements Tag {
    private final Node node;

    public ProcessingMeta(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.RESTRICTED_BY)) {
                stringBuilder.append(new RestrictedBy(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.EXTENDED_BY)) {
                stringBuilder.append(new ExtendedBy(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CUSTOM_META_GROUP)) {
                stringBuilder.append(new CustomMetaGroup(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
