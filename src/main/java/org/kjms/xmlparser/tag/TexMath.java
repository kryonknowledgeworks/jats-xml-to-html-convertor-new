package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class TexMath implements Tag {
    private final Node node;


    public TexMath(Node node) {
        this.node = node;
    }

    public String getElement() {
        return TagUtils.addSpanAndClassTag(node.getTextContent(),"tex-math");
    }
}
