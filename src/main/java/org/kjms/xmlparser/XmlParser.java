package org.kjms.xmlparser;

import org.kjms.xmlparser.utils.DocumentUtils;
import org.w3c.dom.Document;

import java.io.FileWriter;
import java.io.IOException;

public class XmlParser {
    public static void main(String[] args) {

        String input = "C:\\Users\\ADMIN\\Documents\\Java Projects\\Test New One\\parser-in\\parser-in\\GANDF-3-1_2-27.xml";

        String output = "C:/Users/ADMIN/Documents/output.html";

        Document document = DocumentUtils.createDocument(input);

        String html = HtmlBuilder.buildHtml(document);

        try {
            FileWriter myWriter = new FileWriter(output);
            myWriter.write(html);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Conversion Failure");
        }
    }
}