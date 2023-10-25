package org.kjms.xmlparser.commontag.contributornaming;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.name.Name;
import org.w3c.dom.Node;

public class ContributorNamingName extends Name implements Tag {

    private final Node node;

    public ContributorNamingName(Node node) {
        super(node);
        this.node = node;
    }

    public String getElement() {
        return super.getElement();
    }
}
