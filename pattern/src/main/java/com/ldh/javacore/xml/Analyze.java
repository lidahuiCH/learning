package com.ldh.javacore.xml;


import org.junit.Test;
import org.springframework.util.StringUtils;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created on 2018/6/13.
 */
public class Analyze {
    public void readXml() {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            File file = new File("src/main/java/com/ldh/javacore/xml/4014.xml");
            InputStream inputStream = new FileInputStream(new File("src/main/java/com/ldh/javacore/xml/4014.xml"));
            Document doc = builder.parse(file);
            doc = builder.parse(inputStream);
            Element root = doc.getDocumentElement();
            NodeList children = root.getChildNodes();
            NamedNodeMap attributes = root.getAttributes();
            String unit = root.getAttribute("Root");
            for (int i = 0; i < children.getLength(); i++) {
                Node child = children.item(i);
//                child.getNextSibling();
                if (child instanceof Element) {
                    Element elementChild = (Element) child;
                    NodeList second = elementChild.getChildNodes();
                    for (int j = 0; j < second.getLength(); j++) {
                        Node secNode = second.item(j);
                        if (secNode instanceof Element) {
                            Element secondElement = (Element) secNode;
                            Text textNode = (Text) secondElement.getFirstChild();
                            if (null != textNode && !StringUtils.isEmpty(textNode.getData())) {
                                String text = textNode.getData().trim();
                                System.out.println(text);
                            }
                        }
                    }
                    Text textNode = (Text) elementChild.getFirstChild();
                    if (null != textNode && !StringUtils.isEmpty(textNode.getData())) {
                        String text = textNode.getData().trim();
                        System.out.println(text);
                    }
                }
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException sax) {
            sax.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

    @Test
    public void test() {
        readXml();
    }
}
