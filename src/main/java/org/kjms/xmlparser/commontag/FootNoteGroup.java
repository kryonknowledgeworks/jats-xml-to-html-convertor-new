package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.article.front.articlemeta.titlegroup.ArticleTitle;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class FootNoteGroup implements Tag {
    private final Node node;

    public FootNoteGroup(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.LABEL)) {
                stringBuilder.append(new Label(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TITLE)) {
                stringBuilder.append(new Title(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.FOOTNOTE)) {
                stringBuilder.append(new Footnote(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
