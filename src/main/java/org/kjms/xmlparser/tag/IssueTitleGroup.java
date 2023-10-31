package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.w3c.dom.Node;

public class IssueTitleGroup implements Tag {
    private final Node node;

    public IssueTitleGroup(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.ISSUE_TITLE)) {
                stringBuilder.append(new IssueTitle(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ISSUE_SUBTITLE)) {
                stringBuilder.append(new IssueSubtitle(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TRANSLATED_TITLE_GROUP)) {
                stringBuilder.append(new TranslatedTitleGroup(childNode).getElement());
            }
        }

        return stringBuilder.toString();
    }
}
