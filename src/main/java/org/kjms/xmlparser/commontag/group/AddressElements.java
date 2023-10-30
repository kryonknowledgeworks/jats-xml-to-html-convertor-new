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

        final String nodeName = node.getNodeName();

        if (nodeName.equalsIgnoreCase(Element.ADDRESS_LINE)) {
            stringBuilder.append(new AddressLine(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.CITY)) {
            stringBuilder.append(new City(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.COUNTRY)) {
            stringBuilder.append(new Country(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.FAX)) {
            stringBuilder.append(new Fax(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.INSTITUTION)) {
            stringBuilder.append(new Institution(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.INSTITUTION_WRAPPER)) {
            stringBuilder.append(new InstitutionWrapper(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.PHONE)) {
            stringBuilder.append(new Phone(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.POSTAL_CODE)) {
            stringBuilder.append(new PostalCode(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.STATE)) {
            stringBuilder.append(new State(node).getElement());
        }

        return stringBuilder.toString();
    }
}
