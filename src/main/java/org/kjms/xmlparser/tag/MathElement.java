package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.w3c.dom.Node;

public class MathElement implements Tag {
    private final Node node;

    public MathElement(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("<math ");

        Node xmlnsNode = node.getAttributes().getNamedItem("xmlns:mml");

        if (xmlnsNode != null) {
            stringBuilder.append("xmlns=").append(xmlnsNode.getNodeValue()).append(">");
        } else {
            stringBuilder.append(">");
        }

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            if (childNode.getNodeName().equalsIgnoreCase(Element.TEXT)) {
                stringBuilder.append(childNode.getTextContent());
            } else {
                stringBuilder.append(getElementChild(childNode));
            }
        }

       return stringBuilder.append("</math>").toString();
    }

    private String getElementChild(Node node) {

        StringBuilder childData = new StringBuilder();

        final String nodeName = node.getNodeName().replaceAll("mml:", "");

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            if (childNode.getNodeName().equalsIgnoreCase(Element.TEXT)) {
                childData.append(childNode.getTextContent());
            } else {
                childData.append(getElementChild(childNode));
            }
        }

        return "<" + nodeName + ">" + childData + "</" + nodeName + ">";
    }
}
