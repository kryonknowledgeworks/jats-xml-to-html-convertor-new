package org.kjms.xmlparser.commontag.emphasiselements.ruby;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class RubyTextualAnnotation implements Tag {
    private final Node node;

    public RubyTextualAnnotation(Node node) {
        this.node = node;
    }

    public String getElement() {
        return TagUtils.addRtTag(node.getTextContent());
    }
}
