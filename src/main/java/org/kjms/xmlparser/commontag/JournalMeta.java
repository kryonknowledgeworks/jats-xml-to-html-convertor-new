package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class JournalMeta implements Tag {
    private final Node node;

    public JournalMeta(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.JOURNAL_ID)) {
                stringBuilder.append(new JournalId(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.JOURNAL_TITLE_GROUP)) {
                stringBuilder.append(new JournalTitleGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CONTRIBUTOR_GROUP)) {
                stringBuilder.append(new ContributorGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.AFFILIATION)) {
                stringBuilder.append(new Affiliation(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.AFFILIATION_ALTERNATIVES)) {
                stringBuilder.append(new AffiliationAlternatives(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ISSN)) {
                stringBuilder.append(new Issn(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ISSN_LINKING)) {
                stringBuilder.append(new IssnL(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ISBN)) {
                stringBuilder.append(new Isbn(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PUBLISHER)) {
                stringBuilder.append(new Publisher(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.NOTES)) {
                stringBuilder.append(new Notes(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SELF_URI)) {
                stringBuilder.append(new SelfUri(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
