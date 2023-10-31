package org.kjms.xmlparser.tag.group;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.tag.InlineSupplementaryMaterial;
import org.kjms.xmlparser.tag.RelatedArticle;
import org.kjms.xmlparser.tag.RelatedObject;
import org.w3c.dom.Node;

public class RelatedMaterialElements implements Tag {
    private final Node node;

    public RelatedMaterialElements(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        final String nodeName = node.getNodeName();

        if (nodeName.equalsIgnoreCase(Element.INLINE_SUPPLEMENTARY_MATERIAL)) {
            stringBuilder.append(new InlineSupplementaryMaterial(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.RELATED_ARTICLE)) {
            stringBuilder.append(new RelatedArticle(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.RELATED_OBJECT)) {
            stringBuilder.append(new RelatedObject(node).getElement());
        }

        return stringBuilder.toString();
    }
}
