package org.kjms.xmlparser.article.front.articlemeta.contribgroup;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.article.front.articlemeta.contribgroup.aff.Aff;
import org.kjms.xmlparser.article.front.articlemeta.contribgroup.contrib.Contrib;
import org.kjms.xmlparser.utils.NodeUtils;
import org.w3c.dom.Node;

public class ContribGroup implements Tag {
    private final Node node;

    public ContribGroup(Node node) {
        this.node = node;
    }

    public String getElement() {

        Contrib contrib = new Contrib(NodeUtils.getNodes(node, Element.CONTRIB));

        Aff aff = new Aff(NodeUtils.getNodes(node, Element.AFF));

        return contrib.getElement() + aff.getElement();
    }
}
