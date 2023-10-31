package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

import java.util.Map;

public class SelfUri implements Tag {
    private final Node node;

    public SelfUri(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        Map<String, String> map = Map.of("xlink:href", node.getTextContent());

       return stringBuilder.append(TagUtils.addATag(map, node.getTextContent())).toString();

    }
}
