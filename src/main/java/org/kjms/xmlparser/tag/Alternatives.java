package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.tag.group.InlineDisplayElements;
import org.kjms.xmlparser.tag.group.MathElements;
import org.kjms.xmlparser.tag.paragraphleveldisplayelements.*;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Alternatives implements Tag {
    private final Node node;

    public Alternatives(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.OBJECT_ID)) {
                stringBuilder.append(new ObjectId(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ARRAY)) {
                stringBuilder.append(new ArrayElement(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CHEMICAL_STRUCTURE)) {
                stringBuilder.append(new ChemicalStructure(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CODE)) {
                stringBuilder.append(new Code(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.GRAPHIC)) {
                stringBuilder.append(new Graphic(childNode).getElement());
            } else if (Element.INLINE_DISPLAY_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new InlineDisplayElements(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.INLINE_SUPPLEMENTARY_MATERIAL)) {
                stringBuilder.append(new InlineSupplementaryMaterial(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.MEDIA)) {
                stringBuilder.append(new Media(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PREFORMATTED_TEXT)) {
                stringBuilder.append(new Preformat(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SUPPLEMENTARY_MATERIAL_METADATA)) {
                stringBuilder.append(new SupplementaryMaterial(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TABLE)) {
                stringBuilder.append(new Table(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TEXTUAL_FORM)) {
                stringBuilder.append(new TextualForm(childNode).getElement());
            } else if (Element.MATH_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new MathElements(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
