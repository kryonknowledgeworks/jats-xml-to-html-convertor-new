package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.tag.group.OwnershipElements;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;


public class VerseGroup implements Tag {
    private final Node node;

    public VerseGroup(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.LABEL)) {
                stringBuilder.append(new Label(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TITLE)) {
                stringBuilder.append(new Title(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SUBTITLE)) {
                stringBuilder.append(new SubTitle(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.VERSE_LINE)) {
                stringBuilder.append(new VerseLine(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.VERSE_GROUP)) {
                stringBuilder.append(new VerseGroup(childNode).getElement());
            } else if (Element.OWNERSHIP_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new OwnershipElements(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
