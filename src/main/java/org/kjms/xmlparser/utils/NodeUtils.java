package org.kjms.xmlparser.utils;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

public class NodeUtils {
    public static Node getNode(Node node, String elementName) {
        List<Node> nodeList = new ArrayList<>();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            if (childNode != null && !childNode.getNodeName().equals("#text")) {
                nodeList.add(childNode);
            }
        }

        if (nodeList.size() > 0) {

            for (Node childNode : nodeList) {

                if (childNode.getNodeName().equals(elementName)) {

                    return node;
                }
            }
        }

        return (nodeList.size() > 0) ? nodeList.get(0) : null;
    }
}
