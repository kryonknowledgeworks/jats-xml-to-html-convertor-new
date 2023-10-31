package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class SubArticle implements Tag {
    private final Node node;

    public SubArticle(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.PROCESSING_META)) {
                stringBuilder.append(new ProcessingMeta(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.FRONT)) {
                stringBuilder.append(new Front(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.FRONT_STUB)) {
                stringBuilder.append(new FrontStub(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.BODY)) {
                stringBuilder.append(new Body(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.BACK)) {
                stringBuilder.append(new Back(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.FLOATS_GROUP)) {
                stringBuilder.append(new FloatsGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SUB_ARTICLE)) {
                stringBuilder.append(new SubArticle(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.RESPONSE)) {
                stringBuilder.append(new Response(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
