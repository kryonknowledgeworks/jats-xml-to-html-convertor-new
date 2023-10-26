package org.kjms.xmlparser.article.back;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.article.back.ack.Ack;
import org.kjms.xmlparser.article.back.reflist.RefList;
import org.kjms.xmlparser.article.back.sec.BackSec;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Back implements Tag {

    private final Node node;

    public Back(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Tag tag = null;

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.SECTION)) {
                tag = new BackSec(childNode);
            } else if (nodeName.equalsIgnoreCase(Element.ACK)) {
                tag = new Ack(childNode);
            } else if (nodeName.equalsIgnoreCase(Element.REFERENCE_LIST)) {
                tag = new RefList(childNode);
            }

            if (tag != null) {
                stringBuilder.append(tag.getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
