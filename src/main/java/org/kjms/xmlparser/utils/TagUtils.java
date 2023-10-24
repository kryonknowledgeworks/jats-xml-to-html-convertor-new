package org.kjms.xmlparser.utils;

public interface TagUtils {

    static String addBodyTag(String data, String style, String margin) {
        return "<body style=" + style + ";margin:" + margin + ">" + data + "</body>";
    }

    static String addSectionTag(String data) {
        return "<section>" + data + "</section>";
    }

    static String addH1Tag(String data) {
        return "<h1>" + data + "</h1>";
    }

    static String addPTag(String data) {
        return "<p>" + data + "</p>";
    }

    static String addDivTag(String data) {
        return "<div>" + data + "</div>";
    }

    static String addDivTag(String data, String id) {
        return "<div id=" + id + ">" + data + "</div>";
    }

    static String addLabelTag(String data) {
        return "<label>" + data + "</label>";
    }

    static String addATag(String data) {
        return "<a href=" + data + ">" + data + "</a>";
    }
}
