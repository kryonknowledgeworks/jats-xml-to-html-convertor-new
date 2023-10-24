package org.kjms.xmlparser.article.front.articlemeta;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.article.front.articlemeta.articlecategories.ArticleCategories;
import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.article.front.articlemeta.authornotes.AuthorNotes;
import org.kjms.xmlparser.article.front.articlemeta.contribgroup.ContribGroup;
import org.kjms.xmlparser.article.front.articlemeta.titlegroup.TitleGroup;
import org.kjms.xmlparser.utils.NodeUtils;
import org.w3c.dom.Node;

import java.util.List;

public class ArticleMeta implements Tag {
    private final Node node;

    public ArticleMeta(Node node) {
        this.node = node;
}

    public String getElement() {

        List<Node> articleIds = NodeUtils.getNodes(node, Element.ARTICLE_ID);

        ArticleCategories articleCategories = new ArticleCategories(NodeUtils.getNode(node, Element.ARTICLE_CATEGORIES));

        TitleGroup titleGroup = new TitleGroup(NodeUtils.getNode(node, Element.TITLE_GROUP));

        ContribGroup contribGroup = new ContribGroup(NodeUtils.getNode(node, Element.CONTRIB_GROUP));

//        AuthorNotes authorNotes = new AuthorNotes(NodeUtils.getNode());

        return articleCategories.getElement() + titleGroup.getElement() + contribGroup.getElement();
    }
}
