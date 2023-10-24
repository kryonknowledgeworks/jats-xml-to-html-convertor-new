package org.kjms.xmlparser.article.body.sec;

import org.kjms.xmlparser.Tag;
import org.kjms.xmlparser.utils.TagUtils;
import org.w3c.dom.Node;

import java.util.List;

public class BodySec implements Tag {

    private final List<Node> nodes;

    public BodySec(List<Node> nodes) {
        this.nodes = nodes;
    }

    public String getElement() {

        StringBuilder stringBuilder = new StringBuilder();

        for (Node var : nodes) {

        }

        return TagUtils.addSectionTag(stringBuilder.toString());
    }

}
