package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.tag.group.LinkingElement;

import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class ContributorGroup implements Tag {
    private final Node node;

    public ContributorGroup(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.CONTRIBUTOR)) {
                stringBuilder.append(new Contributor(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.AFFILIATION)) {
                stringBuilder.append(new Affiliation(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.AUTHOR_COMMENT)) {
                stringBuilder.append(new AuthorComment(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.BIOGRAPHY)) {
                stringBuilder.append(new Biography(childNode).getElement());
            } else if (Element.LINKING_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new LinkingElement(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ON_BEHALF_OF)) {
                stringBuilder.append(new OnBehalfOf(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ROLE)) {
                stringBuilder.append(new Role(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CROSS_REFERENCE)) {
                stringBuilder.append(new Xref(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
