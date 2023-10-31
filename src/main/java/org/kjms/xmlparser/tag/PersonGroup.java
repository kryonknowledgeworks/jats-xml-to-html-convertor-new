package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.tag.group.ContributorNamingElements;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class PersonGroup implements Tag {
    private final Node node;

    public PersonGroup(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.TEXT)) {
                stringBuilder.append(TagUtils.addSpanTag(childNode.getTextContent()));
            } else if (Element.CONTRIBUTOR_NAMING_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new ContributorNamingElements(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.AFFILIATION)) {
                stringBuilder.append(new Affiliation(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.AFFILIATION_ALTERNATIVES)) {
                stringBuilder.append(new AffiliationAlternatives(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ET_AL)) {
                stringBuilder.append(new EtAl(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ROLE)) {
                stringBuilder.append(new Role(childNode).getElement());
            }
        }

        return stringBuilder.toString();
    }
}
