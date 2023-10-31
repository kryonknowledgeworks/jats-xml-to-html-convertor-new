package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class VolumeIssueGroup implements Tag {
    private final Node node;

    public VolumeIssueGroup(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.VOLUME)) {
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
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
