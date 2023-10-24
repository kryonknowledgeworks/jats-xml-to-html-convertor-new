package org.kjms.xmlparser.utils;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public interface NodeUtils {

    private static List<Node> getNodeList(Node node) {
        List<Node> nodeList = new LinkedList<>();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            if (childNode != null && !childNode.getNodeName().equals("#text")) {
                nodeList.add(childNode);
            }
        }

        return nodeList;
    }

    static Node getNode(Node node, String elementName) {

        List<Node> nodeList = getNodeList(node);

        if (nodeList.size() > 0) {

            for (Node childNode : nodeList) {

                if (childNode.getNodeName().equals(elementName)) {
                    return childNode;
                }
            }
        }

        return (nodeList.size() > 0) ? nodeList.get(0) : null;
    }

    static List<Node> getNodes(Node node, String elementName) {
        List<Node> nodeList = getNodeList(node);

        List<Node> childNodes = new LinkedList<>();

        nodeList.forEach(childNode -> {
            if (childNode.getNodeName().equals(elementName)) {
                childNodes.add(childNode);
            }
        });

        return childNodes;
    }

    static List<Node> getNodes(List<Node> nodeList, String elementName) {

        List<Node> childNodes = new ArrayList<>();

        nodeList.forEach(childNode -> {
            if (childNode.getNodeName().equals(elementName)) {
                childNodes.add(childNode);
            }
        });

        return childNodes;
    }
}
