package org.kjms.xmlparser.commontag.contributornaming;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class ContributorNaming implements Tag {
    private final Node node;

    public ContributorNaming(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        final String nodeName = node.getNodeName();

        Tag tag = null;

        if (nodeName.equalsIgnoreCase(Element.NAME)) {
            tag = new ContributorNamingName(node);
        }

        if (tag != null) {
            stringBuilder.append(TagUtils.addDivTag(tag.getElement()));
        }

        return stringBuilder.toString();
    }
}
