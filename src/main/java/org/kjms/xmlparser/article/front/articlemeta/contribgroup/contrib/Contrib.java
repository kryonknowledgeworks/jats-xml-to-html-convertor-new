package org.kjms.xmlparser.article.front.articlemeta.contribgroup.contrib;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.NodeUtils;
import org.w3c.dom.Node;

import java.util.List;

public class Contrib implements Tag {

    private final List<Node> nodes;

    public Contrib(List<Node> nodes) {
        this.nodes = nodes;
    }

    public String getElement() {

        StringBuilder result = new StringBuilder();

        for (Node node : nodes) {
            Name name = new Name(NodeUtils.getNodes(node, Element.NAME));

            Xref xref = new Xref(NodeUtils.getNodes(node, Element.XREF));

            Node contribId = NodeUtils.getNode(node, Element.CONTRIB);

            result.append(name.getElement()).append(xref.getElement());

            if (contribId != null) {
                result.append(node.getTextContent());
            }

        }

        return result.toString();
    }
}
