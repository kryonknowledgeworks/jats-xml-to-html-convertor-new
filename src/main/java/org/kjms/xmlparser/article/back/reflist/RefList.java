package org.kjms.xmlparser.article.back.reflist;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.article.back.reflist.ref.Ref;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class RefList implements Tag {
    private final Node node;

    public RefList(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Tag tag = null;

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.TITLE)) {
                tag = new RefListTitle(childNode);
            } else if (nodeName.equalsIgnoreCase(Element.REF)) {
                tag = new Ref(childNode);
            } else if (nodeName.equalsIgnoreCase(Element.REF_LIST)) {
                tag = new RefList(childNode);
            }

            if (tag != null) {
                stringBuilder.append(tag.getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }

}
