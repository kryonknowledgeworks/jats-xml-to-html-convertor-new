package org.kjms.xmlparser.utils;

import org.kjms.xmlparser.exception.ParserErrorHandler;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public interface DocumentUtils {
    static Document createDocument(String filePath) {

        try {
            System.setProperty("file.encoding", "UTF-8");

            File file = new File(filePath);

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            factory.setValidating(true);
            DocumentBuilder documentBuilder = factory.newDocumentBuilder();
            documentBuilder.setErrorHandler(new ParserErrorHandler());

            Document document = documentBuilder.parse(file);
            String xlinkNamespaceURI = "http://www.w3.org/1999/xlink";
            document.getDocumentElement().setAttribute("xmlns:xlink", xlinkNamespaceURI);
            document.getDocumentElement().normalize();

            return document;
        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new RuntimeException();
        }

    }
}
