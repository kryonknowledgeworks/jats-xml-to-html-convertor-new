package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class AwardGroup implements Tag {
    private final Node node;

    public AwardGroup(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.FUNDING_SOURCE)) {
                stringBuilder.append(new FundingSource(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SUPPORT_GROUP)) {
                stringBuilder.append(new SupportGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.AWARD_ID)) {
                stringBuilder.append(new AwardId(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.AWARD_NAME)) {
                stringBuilder.append(new AwardName(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.AWARD_DESCRIPTION)) {
                stringBuilder.append(new AwardDescription(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PRINCIPAL_AWARD_RECIPIENT)) {
                stringBuilder.append(new PrincipalAwardRecipient(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PRINCIPAL_INVESTIGATOR)) {
                stringBuilder.append(new PrincipalInvestigator(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
