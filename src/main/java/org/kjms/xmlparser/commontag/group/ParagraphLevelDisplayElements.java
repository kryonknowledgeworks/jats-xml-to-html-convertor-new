package org.kjms.xmlparser.commontag.group;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.paragraphleveldisplayelements.*;
import org.w3c.dom.Node;

public class ParagraphLevelDisplayElements implements Tag {
    private final Node node;

    public ParagraphLevelDisplayElements(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        final String nodeName = node.getNodeName();

        if (nodeName.equalsIgnoreCase(Element.ADDRESS)) {
            stringBuilder.append(new Address(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.ANSWER)) {
            stringBuilder.append(new Answer(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.ANSWER_SET)) {
            stringBuilder.append(new AnswerSet(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.ARRAY)) {
            stringBuilder.append(new ArrayElement(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.BLOCK_LEVEL_ALTERNATIVES)) {
            stringBuilder.append(new BlockAlternatives(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.BOXED_TEXT)) {
            stringBuilder.append(new BoxedText(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.CHEMICAL_STRUCTURE_WRAPPER)) {
            stringBuilder.append(new ChemicalStructureWrapper(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.CODE)) {
            stringBuilder.append(new Code(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.EXPLANATION)) {
            stringBuilder.append(new Explanation(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.FIGURE)) {
            stringBuilder.append(new Figure(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.FIGURE_GROUP)) {
            stringBuilder.append(new FigureGroup(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.GRAPHIC)) {
            stringBuilder.append(new Graphic(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.MEDIA)) {
            stringBuilder.append(new Media(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.PREFORMATTED_TEXT)) {
            stringBuilder.append(new Preformat(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.QUESTION)) {
            stringBuilder.append(new Question(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.QUESTION_WRAPPER)) {
            stringBuilder.append(new QuestionWrapper(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.QUESTION_WRAPPER_GROUP)) {
            stringBuilder.append(new QuestionWrapperGroup(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.SUPPLEMENTARY_MATERIAL_METADATA)) {
            stringBuilder.append(new SupplementaryMaterial(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.TABLE_WRAPPER)) {
            stringBuilder.append(new TableWrapper(node).getElement());
        } else if (nodeName.equalsIgnoreCase(Element.TABLE_WRAPPER_GROUP)) {
            stringBuilder.append(new TableWrapperGroup(node).getElement());
        }

        return stringBuilder.toString();
    }
}
