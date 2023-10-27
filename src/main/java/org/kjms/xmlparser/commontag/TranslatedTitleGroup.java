package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.w3c.dom.Node;

public class TranslatedTitleGroup implements Tag {
    private final Node node;

    public TranslatedTitleGroup(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.TRANS_TITLE)) {
                stringBuilder.append(new TransTitle(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TRANS_SUBTITLE)) {
                stringBuilder.append(new TransSubtitle(childNode).getElement());
            }
        }

        return stringBuilder.toString();
    }
}
