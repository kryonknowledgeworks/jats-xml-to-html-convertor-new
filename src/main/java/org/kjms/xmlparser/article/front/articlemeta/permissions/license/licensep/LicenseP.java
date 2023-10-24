package org.kjms.xmlparser.article.front.articlemeta.permissions.license.licensep;

import org.kjms.xmlparser.Tag;
import org.w3c.dom.Node;

public class LicenseP implements Tag {

    private final Node node;

    public LicenseP(Node node) {
        this.node = node;
    }

    public String getElement() {
        return "";
    }
}
