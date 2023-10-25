package org.kjms.xmlparser.commontag.emphasiselements.ruby;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class Ruby implements Tag {
    private final Node node;

    public Ruby(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.RUBY_BASE_TEXT)) {
                stringBuilder.append(new RubyBaseText(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.RUBY_TEXTUAL_ANNOTATION)) {
                stringBuilder.append(new RubyTextualAnnotation(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
