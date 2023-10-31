package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
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

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.LABEL)) {
                stringBuilder.append(new Label(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.TITLE)) {
                stringBuilder.append(new Title(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ACK)) {
                stringBuilder.append(new Acknowledgments(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.APPENDIX_GROUP)) {
                stringBuilder.append(new AppendixGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.BIOGRAPHY)) {
                stringBuilder.append(new Biography(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.FOOTNOTE_GROUP)) {
                stringBuilder.append(new FootNoteGroup(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.GLOSSARY)) {
                stringBuilder.append(new Glossary(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.REFERENCE_LIST)) {
                stringBuilder.append(new ReferenceList(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.NOTES)) {
                stringBuilder.append(new Notes(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SECTION)) {
                stringBuilder.append(new Section(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
