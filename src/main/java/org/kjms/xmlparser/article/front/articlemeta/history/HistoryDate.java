package org.kjms.xmlparser.article.front.articlemeta.history;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

import java.util.Set;

public class HistoryDate implements Tag {
    private final Node node;

    public HistoryDate(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (Set.of(Element.DAY, Element.MONTH, Element.YEAR).contains(nodeName)) {
                stringBuilder.append(TagUtils.addLabelTag(childNode.getTextContent()));
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
