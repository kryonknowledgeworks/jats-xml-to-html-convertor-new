package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.group.AccessibilityElements;
import org.kjms.xmlparser.commontag.group.LinkingElement;
import org.kjms.xmlparser.commontag.group.OwnershipElements;
import org.kjms.xmlparser.commontag.group.RelatedMaterialElements;
import org.kjms.xmlparser.commontag.paragraphleveldisplayelements.*;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class TableWrapper implements Tag {
    private final Node node;

    public TableWrapper(Node node) {
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
            } else if (nodeName.equalsIgnoreCase(Element.CAPTION)) {
                stringBuilder.append(new Caption(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ABSTRACT)) {
                stringBuilder.append(new ElementAbstract(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SUBJECT_GROUP)) {
                stringBuilder.append(new SubjectGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.KEYWORD_GROUP)) {
                stringBuilder.append(new KeywordGroup(childNode).getElement());
            } else if (Element.ACCESSIBILITY_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new AccessibilityElements(childNode).getElement());
            } else if (Element.LINKING_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new LinkingElement(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.DISPLAY_QUOTE)) {
                stringBuilder.append(new DisplayQuote(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SPEECH)) {
                stringBuilder.append(new Speech(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.STATEMENT)) {
                stringBuilder.append(new Statement(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.VERSE_FORM_FOR_POETRY)) {
                stringBuilder.append(new VerseGroup(childNode).getElement());
            } else if (Element.LIST.contains(nodeName)) {
                stringBuilder.append(new ListElements(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ALTERNATIVES)) {
                stringBuilder.append(new Alternatives(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CHEMICAL_STRUCTURE_WRAPPER)) {
                stringBuilder.append(new ChemicalStructureWrapper(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CODE)) {
                stringBuilder.append(new Code(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.DISPLAY_FORMULA)) {
                stringBuilder.append(new DisplayFormula(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.GRAPHIC)) {
                stringBuilder.append(new Graphic(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.MEDIA)) {
                stringBuilder.append(new Media(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.PREFORMATTED_TEXT)) {
                stringBuilder.append(new Preformat(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TABLE)) {
                stringBuilder.append(new Table(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.CROSS_REFERENCE)) {
                stringBuilder.append(new Xref(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TABLE_WRAPPER_GROUP)) {
                stringBuilder.append(new TableWrapperGroup(childNode).getElement());
            } else if (Element.OWNERSHIP_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new OwnershipElements(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(node.getTextContent());
    }
}