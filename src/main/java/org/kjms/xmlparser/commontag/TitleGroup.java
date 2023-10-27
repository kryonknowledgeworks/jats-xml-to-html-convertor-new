package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.article.front.articlemeta.titlegroup.ArticleTitle;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class TitleGroup implements Tag {
    private final Node node;

    public TitleGroup(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.ARTICLE_TITLE)) {
                stringBuilder.append(new ArticleTitle(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SUBTITLE)) {
                stringBuilder.append(new SubTitle(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TRANSLATED_TITLE_GROUP)) {
                stringBuilder.append(new TranslatedTitleGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ALTERNATE_TITLE)) {
                stringBuilder.append(new AlternateTitle(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.FOOTNOTE_GROUP)) {
                stringBuilder.append(new FootNoteGroup(childNode).getElement());
            }
        }

        return TagUtils.addH1Tag(stringBuilder.toString());
    }
}
