package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class JournalTitleGroup implements Tag {
    private final Node node;

    public JournalTitleGroup(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.JOURNAL_TITLE)) {
                stringBuilder.append(new JournalTitle(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.JOURNAL_SUBTITLE)) {
                stringBuilder.append(new JournalSubtitle(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TRANSLATED_TITLE_GROUP)) {
                stringBuilder.append(new TranslatedTitleGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ABBREVIATION_JOURNAL_TITLE)) {
                stringBuilder.append(new AbbreviationJournalTitle(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
