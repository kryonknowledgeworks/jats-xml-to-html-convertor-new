package org.kjms.xmlparser.article.back.reflist.ref;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.NodeUtils;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Ref implements Tag {

    private final Node node;

    public Ref(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Tag tag = null;

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.LABEL)) {
                tag = new RefLabel(childNode);
            } else if (Element.CITATION_ELEMENTS.contains(childNode.getNodeName())) {
                tag = new RefCitationElements(childNode);
            }

            if (tag != null) {
                stringBuilder.append(tag.getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString(), NodeUtils.getId(node));
    }
}
