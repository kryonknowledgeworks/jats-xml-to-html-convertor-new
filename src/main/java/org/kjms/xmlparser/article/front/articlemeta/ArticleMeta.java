package org.kjms.xmlparser.article.front.articlemeta;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.article.front.articlemeta.abstracttag.ArticleMetaAbstract;
import org.kjms.xmlparser.article.front.articlemeta.articlecategories.ArticleCategories;
import org.kjms.xmlparser.article.front.articlemeta.authornotes.AuthorNotes;
import org.kjms.xmlparser.article.front.articlemeta.contribgroup.ContribGroup;
import org.kjms.xmlparser.article.front.articlemeta.history.History;
import org.kjms.xmlparser.article.front.articlemeta.kwdgroup.KwdGroup;
import org.kjms.xmlparser.article.front.articlemeta.permissions.Permission;
import org.kjms.xmlparser.article.front.articlemeta.titlegroup.TitleGroup;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class ArticleMeta implements Tag {
    private final Node node;

    public ArticleMeta(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.ARTICLE_ID)) {
                stringBuilder.append(new ArticleId(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ARTICLE_CATEGORIES)) {
                stringBuilder.append(new ArticleCategories(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TITLE_GROUP)) {
                stringBuilder.append(new TitleGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CONTRIB_GROUP)) {
                stringBuilder.append(new ContribGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.AUTHOR_NOTES)) {
                stringBuilder.append(new AuthorNotes(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PUB_DATE)) {
                stringBuilder.append(new PubDate().getElement());
            } else if (nodeName.equalsIgnoreCase(Element.VOLUME)) {
                stringBuilder.append(TagUtils.addLabelTag(childNode.getTextContent()));
            } else if (nodeName.equalsIgnoreCase(Element.ISSUE)) {
                stringBuilder.append(TagUtils.addLabelTag(childNode.getTextContent()));
            } else if (nodeName.equalsIgnoreCase(Element.FPAGE)) {
                stringBuilder.append(TagUtils.addLabelTag(childNode.getTextContent()));
            } else if (nodeName.equalsIgnoreCase(Element.LPAGE)) {
                stringBuilder.append(TagUtils.addLabelTag(childNode.getTextContent()));
            }else if (nodeName.equalsIgnoreCase(Element.PERMISSIONS)) {
                stringBuilder.append(new Permission(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.HISTORY)) {
                stringBuilder.append(new History(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ABSTRACT)) {
                stringBuilder.append(new ArticleMetaAbstract(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.KWD_GROUP)) {
                stringBuilder.append(new KwdGroup(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
