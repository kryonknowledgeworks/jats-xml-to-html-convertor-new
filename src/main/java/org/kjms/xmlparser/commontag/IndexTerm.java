package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class IndexTerm implements Tag {
    private final Node node;

    public IndexTerm(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.TERM)) {
                stringBuilder.append(new Term(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.INDEX_TERM)) {
                stringBuilder.append(new IndexTerm(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SEE)) {
                stringBuilder.append(new See(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SEE_ALSO)) {
                stringBuilder.append(new SeeAlso(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
