package org.kjms.xmlparser.utils;

import org.kjms.xmlparser.Tag;

public interface TagUtils extends Tag {

    static String addSectionTag(String tag) {
        return "<section>" + tag + "</section>";
    }
}
