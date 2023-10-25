package org.kjms.xmlparser.utils;

import java.util.Map;

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

    static String addATag(Map<String, String> attributes, String link) {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("<a ");

        attributes.forEach((key, value) -> stringBuilder.append(key).append("=").append(value));

        return stringBuilder.append(" >").append(link).append(" </a>").toString();
    }

    static String addBTag(String data) {
        return "<b>" + data + "</b>";
    }

    static String addITag(String data) {
        return "<i> " + data + " </i>";
    }

    static String addCodeTag(String data) {
        return "<code> " + data + " </code>";
    }

    static String addSpanTag(String data, String style) {
        return "<span style=" + style + " >" + data + " </span>";
    }

    static String addSpanTag(String data) {
        return "<span> " + data + " </span>";
    }

    static String addSTag(String data) {
        return "<s> " + data + " </s>";
    }

    static String addUTag(String data) {
        return "<u> " + data + " </u>";
    }

    static String addRbTag(String data) {
        return "<rb> " + data + " </rb>";
    }

    static String addRtTag(String data) {
        return "<rt> " + data + " </rt>";
    }
}
