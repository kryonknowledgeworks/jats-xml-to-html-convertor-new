package org.kjms.xmlparser.commontag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.commontag.group.BaselineChangeElements;
import org.kjms.xmlparser.commontag.group.EmphasisElements;
import org.kjms.xmlparser.commontag.group.InlineDisplayElements;
import org.kjms.xmlparser.commontag.paragraphleveldisplayelements.Graphic;
import org.kjms.xmlparser.commontag.paragraphleveldisplayelements.Media;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class SignatureBlock implements Tag {
    private final Node node;

    public SignatureBlock(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.TEXT)) {
                stringBuilder.append(TagUtils.addSpanTag(childNode.getTextContent()));
            }else if (nodeName.equalsIgnoreCase(Element.BREAK)) {
                stringBuilder.append(new BreakLine(childNode).getElement());
            } else if (Element.EMPHASIS_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new EmphasisElements(childNode).getElement());
            }else if (nodeName.equalsIgnoreCase(Element.ALTERNATIVES)) {
                stringBuilder.append(new Alternatives(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.MEDIA)) {
                stringBuilder.append(new Media(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.GRAPHIC)) {
                stringBuilder.append(new Graphic(childNode).getElement());
            }  else if (Element.INLINE_DISPLAY_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new InlineDisplayElements(childNode).getElement());
            }else if (nodeName.equalsIgnoreCase(Element.NAMED_SPECIAL_CONTENT)) {
                stringBuilder.append(new NamedSpecialContent(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.STYLED_SPECIAL_CONTENT)) {
                stringBuilder.append(new StyledSpecialContent(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.SIGNATURE)) {
                stringBuilder.append(new Signature(childNode).getElement());
            }else if (Element.BASELINE_CHANGE_ELEMENTS.contains(nodeName)) {
                stringBuilder.append(new BaselineChangeElements(childNode).getElement());
            }
        }

        return stringBuilder.toString();
    }}
