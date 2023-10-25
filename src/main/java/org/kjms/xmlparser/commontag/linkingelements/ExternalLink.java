package org.kjms.xmlparser.commontag.linkingelements;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.Map;

public class ExternalLink implements Tag {

    private final Node node;

    public ExternalLink(Node node) {
        this.node = node;
    }

    public String getElement() {

        Node xmlnsXlinkNode = node.getAttributes().getNamedItem("xmlns:xlink");
        Node xlinkHref = node.getAttributes().getNamedItem("xlink:href");

        Map<String, String> map = new HashMap<>();

        if (xmlnsXlinkNode != null) {
            map.put("xmlns:xlink", xmlnsXlinkNode.getNodeValue());
        }

        if (xlinkHref != null) {
            map.put("xlink:href", xlinkHref.getNodeValue());
        }

        if (node.getChildNodes().getLength() > 0) {
            return TagUtils.addATag(map, node.getChildNodes().item(0).getTextContent());
        } else {
            return TagUtils.addATag(map, "");
        }
    }
}
