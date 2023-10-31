package org.kjms.xmlparser.tag.paragraphleveldisplayelements;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.tag.*;
import org.kjms.xmlparser.tag.group.MathElements;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Answer implements Tag {
    private final Node node;

    public Answer(Node node) {
        this.node = node;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.OBJECT_ID)) {
                stringBuilder.append(new ObjectId(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.LABEL)) {
                stringBuilder.append(new Label(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TITLE)) {
                stringBuilder.append(new Title(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ALTERNATE_TITLE)) {
                stringBuilder.append(new AlternateTitle(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SECTION)) {
                stringBuilder.append(new Section(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ADDRESS)) {
                stringBuilder.append(new Address(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ALTERNATIVES)) {
                stringBuilder.append(new Alternatives(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ANSWER)) {
                stringBuilder.append(new Answer(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ANSWER_SET)) {
                stringBuilder.append(new AnswerSet(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ARRAY)) {
                stringBuilder.append(new ArrayElement(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.BLOCK_LEVEL_ALTERNATIVES)) {
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
            } else if (nodeName.equalsIgnoreCase(Element.PREFORMATTED_TEXT)) {
                stringBuilder.append(new Preformat(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.QUESTION)) {
                stringBuilder.append(new Question(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.QUESTION_WRAPPER)) {
                stringBuilder.append(new QuestionWrapper(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.QUESTION_WRAPPER_GROUP)) {
                stringBuilder.append(new QuestionWrapperGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SUPPLEMENTARY_MATERIAL_METADATA)) {
                stringBuilder.append(new SupplementaryMaterial(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TABLE_WRAPPER)) {
                stringBuilder.append(new TableWrapper(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.DISPLAY_FORMULA)) {
                stringBuilder.append(new DisplayFormula(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.DISPLAY_FORMULA_GROUP)) {
                stringBuilder.append(new DisplayFormulaGroup(childNode).getElement());
            } else if (Element.LIST.contains(nodeName)) {
                stringBuilder.append(new ListElements(childNode).getElement());
            } else if (Element.MATH_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new MathElements(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PARAGRAPH)) {
                stringBuilder.append(new Paragraph(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.RELATED_ARTICLE)) {
                stringBuilder.append(new RelatedArticle(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.RELATED_OBJECT)) {
                stringBuilder.append(new RelatedObject(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.DISPLAY_QUOTE)) {
                stringBuilder.append(new DisplayQuote(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SPEECH)) {
                stringBuilder.append(new Speech(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.STATEMENT)) {
                stringBuilder.append(new Statement(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.VERSE_FORM_FOR_POETRY)) {
                stringBuilder.append(new VerseGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SECTION)) {
                stringBuilder.append(new Section(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.FOOTNOTE_GROUP)) {
                stringBuilder.append(new FootNoteGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.GLOSSARY)) {
                stringBuilder.append(new Glossary(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.REFERENCE_LIST)) {
                stringBuilder.append(new ReferenceList(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.EXPLANATION)) {
                stringBuilder.append(new Explanation(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
