package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class PrincipalAwardRecipient implements Tag {
    private final Node node;

    public PrincipalAwardRecipient(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.TEXT)) {
                stringBuilder.append(TagUtils.addSpanTag(childNode.getTextContent()));
            } else if (nodeName.equalsIgnoreCase(Element.CONTRIBUTOR_ID)) {
                stringBuilder.append(new ContributorId(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.NAME)) {
                stringBuilder.append(new Name(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.NAME_ALTERNATIVES)) {
                stringBuilder.append(new NameAlternatives(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.INSTITUTION)) {
                stringBuilder.append(new Institution(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.INSTITUTION_WRAPPER)) {
                stringBuilder.append(new InstitutionWrapper(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.STRING_NAME)) {
                stringBuilder.append(new StringName(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
