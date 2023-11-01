package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.tag.group.LinkingElement;
import org.kjms.xmlparser.tag.group.AddressElements;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Address implements Tag {
    private final Node node;

    public Address(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (Element.ADDRESS_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new AddressElements(childNode).getElement());
            } else if (Element.LINKING_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new LinkingElement(childNode).getElement());
            }
        }

        return TagUtils.addAddressTag(stringBuilder.toString());
    }
}
