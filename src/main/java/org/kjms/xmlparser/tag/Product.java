package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.tag.group.*;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Product implements Tag {
    private final Node node;

    public Product(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.TEXT)) {
                stringBuilder.append(TagUtils.addSpanTag(childNode.getTextContent()));
            } else if (Element.RELATED_MATERIAL_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new RelatedMaterialElements(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.BREAK)) {
                stringBuilder.append(new BreakLine(childNode).getElement());
            } else if (Element.EMPHASIS_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new EmphasisElements(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ALTERNATIVES)) {
                stringBuilder.append(new Alternatives(childNode).getElement());
            } else if (Element.INLINE_DISPLAY_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new InlineDisplayElements(childNode).getElement());
            } else if (Element.INLINE_MATH_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new InlineMathElements(childNode).getElement());
            } else if (Element.OTHER_INLINE_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new OtherInlineElements(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PRICE)) {
                stringBuilder.append(new Price(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ANNOTATION)) {
                stringBuilder.append(new Annotation(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ARTICLE_TITLE)) {
                stringBuilder.append(new ArticleTitle(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CHAPTER_TITLE)) {
                stringBuilder.append(new ChapterTitle(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.COLLABORATIVE)) {
                stringBuilder.append(new Collaborative(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.COLLABORATIVE_ALTERNATIVES)) {
                stringBuilder.append(new CollaborativeAlternatives(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.COMMENT)) {
                stringBuilder.append(new Comment(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CONFERENCE_ACRONYM)) {
                stringBuilder.append(new ConferenceAcronym(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CONFERENCE_DATE)) {
                stringBuilder.append(new ConferenceDate(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CONFERENCE_LOCATION)) {
                stringBuilder.append(new ConferenceLocation(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CONFERENCE_NAME)) {
                stringBuilder.append(new ConferenceName(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CONFERENCE_SPONSOR)) {
                stringBuilder.append(new ConferenceSponsor(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.DATA_TITLE)) {
                stringBuilder.append(new DataTitle(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.DATE)) {
                stringBuilder.append(new Date(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.DATE_IN_CITATION)) {
                stringBuilder.append(new DateInCitation(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.DAY)) {
                stringBuilder.append(new Day(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.EDITION)) {
                stringBuilder.append(new Edition(childNode).getElement());
            } else if (Element.LINKING_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new LinkingElement(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ELOCATION_ID)) {
                stringBuilder.append(new ElocationId(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ET_AL)) {
                stringBuilder.append(new EtAl(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.FPAGE)) {
                stringBuilder.append(new FirstPage(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.GOVERNMENT)) {
                stringBuilder.append(new Government(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.INSTITUTION)) {
                stringBuilder.append(new Institution(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.INSTITUTION_WRAPPER)) {
                stringBuilder.append(new InstitutionWrapper(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ISBN)) {
                stringBuilder.append(new Isbn(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ISSN)) {
                stringBuilder.append(new Issn(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ISSN_LINKING)) {
                stringBuilder.append(new IssnL(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ISSUE)) {
                stringBuilder.append(new Issue(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ISSUE_ID)) {
                stringBuilder.append(new IssueId(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ISSUE_PART)) {
                stringBuilder.append(new IssuePart(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ISSUE_TITLE)) {
                stringBuilder.append(new IssueTitle(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.LPAGE)) {
                stringBuilder.append(new LastPage(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.MONTH)) {
                stringBuilder.append(new Month(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.NAME)) {
                stringBuilder.append(new Name(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.NAME_ALTERNATIVES)) {
                stringBuilder.append(new NameAlternatives(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.OBJECT_ID)) {
                stringBuilder.append(new ObjectId(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PAGE_RANGE)) {
                stringBuilder.append(new PageRange(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PART_TITLE)) {
                stringBuilder.append(new PartTitle(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PATENT)) {
                stringBuilder.append(new Patent(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PERSON_GROUP)) {
                stringBuilder.append(new PersonGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PUBLICATION_ID)) {
                stringBuilder.append(new PublisherId(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PUBLISHER_LOCATION)) {
                stringBuilder.append(new PublisherLocation(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PUBLISHER_NAME)) {
                stringBuilder.append(new PublisherName(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ROLE)) {
                stringBuilder.append(new Role(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SEASON)) {
                stringBuilder.append(new Season(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SERIES)) {
                stringBuilder.append(new Series(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SIZE)) {
                stringBuilder.append(new Size(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SOURCE)) {
                stringBuilder.append(new Source(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.STANDARD)) {
                stringBuilder.append(new Standard(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.STRING_NAME)) {
                stringBuilder.append(new StringName(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.STRING_DATE)) {
                stringBuilder.append(new StringDate(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SUPPLEMENT)) {
                stringBuilder.append(new Supplement(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TRANS_SOURCE)) {
                stringBuilder.append(new TranslatedSource(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TRANS_TITLE)) {
                stringBuilder.append(new TranslatedTitle(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.VERSION)) {
                stringBuilder.append(new Version(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.VOLUME)) {
                stringBuilder.append(new Volume(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.VOLUME_ID)) {
                stringBuilder.append(new VolumeId(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.VOLUME_SERIES)) {
                stringBuilder.append(new VolumeSeries(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.YEAR)) {
                stringBuilder.append(new Year(childNode).getElement());
            } else if (Element.INTERNAL_LINKING_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new InternalLinkingElements(childNode).getElement());
            } else if (Element.BASELINE_CHANGE_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new BaselineChangeElements(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
