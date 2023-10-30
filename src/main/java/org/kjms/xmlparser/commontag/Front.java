package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;

import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Front implements Tag {
    private final Node node;

    public Front(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.JOURNAL_META)) {
                stringBuilder.append(new JournalMeta(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ARTICLE_META)) {
                stringBuilder.append(new ArticleMeta(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.NOTES)) {
                stringBuilder.append(new Notes(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
