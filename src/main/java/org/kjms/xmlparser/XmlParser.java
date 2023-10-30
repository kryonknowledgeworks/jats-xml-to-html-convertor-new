package org.kjms.xmlparser;

import org.apache.commons.io.FileUtils;
import org.kjms.xmlparser.exception.ParserErrorHandler;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class XmlParser {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        System.setProperty("file.encoding", "UTF-8");

        String inputFilePath = "C:\\Users\\ADMIN\\Documents\\Java Projects\\Test New One\\parser-in\\parser-in\\GANDF-3-1_2-27.xml";
        String outputFilePath = "C:\\Users\\ADMIN\\Documents\\output.html";

        File file = new File(inputFilePath);

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        factory.setValidating(true);
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        documentBuilder.setErrorHandler(new ParserErrorHandler());
        Document document = documentBuilder.parse(file);
        String xlinkNamespaceURI = "http://www.w3.org/1999/xlink";
        document.getDocumentElement().setAttribute("xmlns:xlink", xlinkNamespaceURI);
        document.getDocumentElement().normalize();

        String html = HtmlBuilder.buildHtml(document);

        FileWriter myWriter = new FileWriter(outputFilePath);
        myWriter.write(html);
        myWriter.close();
    }
}