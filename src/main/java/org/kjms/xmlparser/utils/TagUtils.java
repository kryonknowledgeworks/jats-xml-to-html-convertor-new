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
        return "<div> " + data + " </div>";
    }

    static String addDivTag(String data, String id) {
        return "<div id=" + id + "> " + data + " </div>";
    }

    static String addDivAndClassTag(String data, String clazz) {
        return "<div class=" + clazz + "> " + data + " </div>";
    }

    static String addLabelTag(String data) {
        return "<label> " + data + " </label>";
    }

    static String addATag(String data) {
        return " <a href=" + data + "> " + data + " </a> ";
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

    static String addPreTag(String data) {
        return "<pre>" + data + "</pre>";
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
    static String addTableTag(String data) {
        return "<table> " + data + " </table>";
    }
    static String addSpanAndClassTag(String data, String clazz) {
        return "<span class=" + clazz + " > " + data + " </span>";
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

    static String addRubyTag(String data) {
        return "<ruby> " + data + " </ruby>";
    }

    static String addRtTag(String data) {
        return "<rt> " + data + " </rt>";
    }

    static String addSupTag(String data) {
        return "<sup> " + data + " </sup>";
    }

    static String addSuBTag(String data) {
        return "<sub> " + data + " </sub>";
    }

    static String addTrTag(String data) {
        return "<tr> " + data + " </tr>";
    }

    static String addTdTag(String data) {
        return "<td> " + data + " </td>";
    }

    static String addThTag(String data) {
        return "<th> " + data + " </th>";
    }

    static String addTHeadTag(String data) {
        return "<thead> " + data + " </thead>";
    }

    static String addTFootTag(String data) {
        return "<tfoot> " + data + " </tfoot>";
    }

    static String addTBodyTag(String data) {
        return "<tbody> " + data + " </tbody>";
    }
}
