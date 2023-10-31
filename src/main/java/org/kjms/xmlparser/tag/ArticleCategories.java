package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class ArticleCategories implements Tag {
    private final Node node;

    public ArticleCategories(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.SUBJECT_GROUP)) {
                stringBuilder.append(new SubjectGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SERIES_TITLE)) {
                stringBuilder.append(new SeriesTitle(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SERIES_TEXT)) {
                stringBuilder.append(new SeriesText(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
