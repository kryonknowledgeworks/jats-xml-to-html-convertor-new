package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class AliLicenseReference implements Tag {
    private final Node node;

    public AliLicenseReference(Node node) {
        this.node = node;
    }

    public String getElement() {
        return TagUtils.addSpanTag(node.getAttributes().getNamedItem("xmlns:ali").getNodeValue());
    }
}
