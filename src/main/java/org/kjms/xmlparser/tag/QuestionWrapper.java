package org.kjms.xmlparser.tag;

import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.tag.*;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

public class QuestionWrapper implements Tag {
    private final Node node;

    public QuestionWrapper(Node node) {
        this.node = node;
    }

    public String getElement() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < node.getChildNodes().getLength(); i++) {

            Node childNode = node.getChildNodes().item(i);

            final String nodeName = childNode.getNodeName();

            if (nodeName.equalsIgnoreCase(Element.OBJECT_ID)) {
                stringBuilder.append(new ObjectId(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.QUESTION)) {
                stringBuilder.append(new Question(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ANSWER)) {
                stringBuilder.append(new Answer(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.ANSWER_SET)) {
                stringBuilder.append(new AnswerSet(childNode).getElement());
            } else if (nodeName.equalsIgnoreCase(Element.EXPLANATION)) {
                stringBuilder.append(new Explanation(childNode).getElement());
            }
        }

        return TagUtils.addDivTag(stringBuilder.toString());
    }
}
