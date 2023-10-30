package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.group.EmphasisElements;
import org.kjms.xmlparser.commontag.group.ParagraphLevelDisplayElements;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Notes implements Tag {
    private final Node node;

    public Notes(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.SECTION_META)) {
                stringBuilder.append(new SectionMeta(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.LABEL)) {
                stringBuilder.append(new Label(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TITLE)) {
                stringBuilder.append(new Title(childNode).getElement());
            } else if (Element.PARAGRAPH_LEVEL_DISPLAY_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new ParagraphLevelDisplayElements(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ALTERNATIVES)) {
                stringBuilder.append(new Alternatives(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.DISPLAY_FORMULA)) {
                stringBuilder.append(new DisplayFormula(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.DISPLAY_FORMULA_GROUP)) {
                stringBuilder.append(new DisplayFormulaGroup(childNode).getElement());
            } else if (Element.LIST.contains(nodeName)) {
                stringBuilder.append(new ListElements(childNode).getElement());
            } else if (Element.MATH_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new MathElement(childNode).getElement());
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
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
