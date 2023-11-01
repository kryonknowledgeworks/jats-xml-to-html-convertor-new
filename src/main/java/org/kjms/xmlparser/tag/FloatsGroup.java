package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class FloatsGroup implements Tag {
    private final Node node;

    public FloatsGroup(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.ALTERNATIVES)) {
                stringBuilder.append(new Alternatives(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.BLOCK_ALTERNATIVES)) {
                stringBuilder.append(new BlockAlternatives(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.BOXED_TEXT)) {
                stringBuilder.append(new BoxedText(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CHEMICAL_STRUCTURE_WRAPPER)) {
                stringBuilder.append(new ChemicalStructureWrapper(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CODE)) {
                stringBuilder.append(new Code(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.FIGURE)) {
                stringBuilder.append(new Figure(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.FIGURE_GROUP)) {
                stringBuilder.append(new FigureGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.GRAPHIC)) {
                stringBuilder.append(new Graphic(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.MEDIA)) {
                stringBuilder.append(new Media(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PREFORMAT)) {
                stringBuilder.append(new Preformat(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SUPPLEMENTARY_MATERIAL)) {
                stringBuilder.append(new SupplementaryMaterial(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TABLE_WRAPPER)) {
                stringBuilder.append(new TableWrapper(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TABLE_WRAPPER_GROUP)) {
                stringBuilder.append(new TableWrapperGroup(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
