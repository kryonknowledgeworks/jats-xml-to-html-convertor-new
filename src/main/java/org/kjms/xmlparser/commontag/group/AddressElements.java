package org.kjms.xmlparser.commontag.group;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.*;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class AddressElements implements Tag {
    private final Node node;

    public AddressElements(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.ADDRESS_LINE)) {
                stringBuilder.append(new AddressLine(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CITY)) {
                stringBuilder.append(new City(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.COUNTRY)) {
                stringBuilder.append(new Country(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.FAX)) {
                stringBuilder.append(new Fax(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.INSTITUTION)) {
                stringBuilder.append(new Institution(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.INSTITUTION_WRAP)) {
                stringBuilder.append(new InstitutionWrap(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PHONE)) {
                stringBuilder.append(new Phone(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.POSTAL_CODE)) {
                stringBuilder.append(new PostalCode(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.STATE)) {
                stringBuilder.append(new State(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
