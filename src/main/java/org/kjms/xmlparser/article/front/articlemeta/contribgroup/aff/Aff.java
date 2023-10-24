package org.kjms.xmlparser.article.front.articlemeta.contribgroup.aff;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.NodeUtils;
import org.w3c.dom.Node;

import java.util.List;
import java.util.Set;

public class Aff implements Tag {
    private final List<Node> nodes;

    public Aff(List<Node> nodes) {
        this.nodes = nodes;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        for (Node node : nodes) {
            if (Set.of(Element.TEXT, Element.LABEL).contains(node.getNodeName())) {
                stringBuilder.append(node.getTextContent());
            }
        }

        return stringBuilder.toString();
    }
}
