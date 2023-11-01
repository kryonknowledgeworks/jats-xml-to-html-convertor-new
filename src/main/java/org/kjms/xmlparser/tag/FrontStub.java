package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.tag.group.LinkingElement;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class FrontStub implements Tag {
    private final Node node;

    public FrontStub(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.ARTICLE_ID)) {
                stringBuilder.append(new ArticleId(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ARTICLE_VERSION)) {
                stringBuilder.append(new ArticleVersion(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ARTICLE_VERSION_ALTERNATIVES)) {
                stringBuilder.append(new ArticleVersionAlternatives(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ARTICLE_CATEGORIES)) {
                stringBuilder.append(new ArticleCategories(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TITLE_GROUP)) {
                stringBuilder.append(new TitleGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CONTRIBUTOR_GROUP)) {
                stringBuilder.append(new ContributorGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.AFFILIATION)) {
                stringBuilder.append(new Affiliation(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.AFFILIATION_ALTERNATIVES)) {
                stringBuilder.append(new AffiliationAlternatives(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.AUTHOR_NOTES)) {
                stringBuilder.append(new AuthorNotes(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PUBLICATION_DATE)) {
                stringBuilder.append(new PublicationDate(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PUBLICATION_DATE_NOT_AVAILABLE)) {
                stringBuilder.append(new PublicationDateNotAvailable(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.VOLUME)) {
                stringBuilder.append(new Volume(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.VOLUME_ID)) {
                stringBuilder.append(new VolumeId(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.VOLUME_SERIES)) {
                stringBuilder.append(new VolumeSeries(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ISSUE)) {
                stringBuilder.append(new Issue(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ISSUE_ID)) {
                stringBuilder.append(new IssueId(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ISSUE_TITLE)) {
                stringBuilder.append(new IssueTitle(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ISSUE_TITLE_GROUP)) {
                stringBuilder.append(new IssueTitleGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ISSUE_SPONSOR)) {
                stringBuilder.append(new IssueSponsor(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ISSUE_PART)) {
                stringBuilder.append(new IssuePart(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.VOLUME_ISSUE_GROUP)) {
                stringBuilder.append(new VolumeIssueGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ISBN)) {
                stringBuilder.append(new Isbn(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SUPPLEMENT)) {
                stringBuilder.append(new Supplement(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.FPAGE)) {
                stringBuilder.append(new FirstPage(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.LPAGE)) {
                stringBuilder.append(new LastPage(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PAGE_RANGE)) {
                stringBuilder.append(new PageRange(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ELOCATION_ID)) {
                stringBuilder.append(new ElocationId(childNode).getElement());
            } else if (Element.LINKING_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new LinkingElement(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PRODUCT)) {
                stringBuilder.append(new Product(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SUPPLEMENTARY_MATERIAL)) {
                stringBuilder.append(new SupplementaryMaterial(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.HISTORY)) {
                stringBuilder.append(new History(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PUBLICATION_HISTORY)) {
                stringBuilder.append(new PublicationHistory(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PERMISSIONS)) {
                stringBuilder.append(new Permissions(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SELF_URI)) {
                stringBuilder.append(new SelfUri(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.RELATED_ARTICLE)) {
                stringBuilder.append(new RelatedArticle(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.RELATED_OBJECT)) {
                stringBuilder.append(new RelatedObject(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ABSTRACT)) {
                stringBuilder.append(new AbstractElement(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TRANS_ABSTRACT)) {
                stringBuilder.append(new TranslatedAbstract(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.KEYWORD_GROUP)) {
                stringBuilder.append(new KeywordGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.FUNDING_GROUP)) {
                stringBuilder.append(new FundingGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SUPPORT_GROUP)) {
                stringBuilder.append(new SupportGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CONFERENCE)) {
                stringBuilder.append(new Conference(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.COUNTS)) {
                stringBuilder.append(new Counts(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CUSTOM_META_GROUP)) {
                stringBuilder.append(new CustomMetaGroup(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
