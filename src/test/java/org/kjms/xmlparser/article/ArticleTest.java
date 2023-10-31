package org.kjms.xmlparser.article;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.kjms.xmlparser.Element;
import org.kjms.xmlparser.utils.DocumentUtils;
import org.w3c.dom.*;

import static org.junit.jupiter.api.Assertions.*;

class ArticleTest {

    private Node node;

    @BeforeEach
    void setUp() {
        String input = "C:\\Users\\ADMIN\\Documents\\Java Projects\\Test New One\\parser-in\\parser-in\\GANDF-3-1_2-27.xml";

        // Create a sample XML document
        node = DocumentUtils.createDocument(input).getDocumentElement();

        assertNotNull(node);

        assertEquals(Element.ARTICLE, node.getNodeName());
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void getElement() {

        Article article = new Article(node);

        
    }
}