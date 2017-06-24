package com.chris.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLFileReader {
	
	@Test
	public void demo() throws Exception{
		File staffFile = new File("src\\test\\java\\com\\chris\\xml\\staff.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = dbFactory.newDocumentBuilder();
		Document doc = docBuilder.parse(staffFile);
		
		doc.getDocumentElement().normalize();
		
		System.out.println("root element name: " + doc.getDocumentElement().getNodeName());
		
		NodeList nodeList = doc.getElementsByTagName("staff");
		
		System.out.println("staff infos");
		for(int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if(node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element)node;
				System.out.println("staff id: " + element.getAttribute("id"));
				System.out.println("firstname: " + element.getElementsByTagName("firstname").item(0).getTextContent());
				System.out.println("lastname: " + element.getElementsByTagName("lastname").item(0).getTextContent());
				System.out.println("gender: " + element.getElementsByTagName("gender").item(0).getTextContent());
				System.out.println("-------------------------");
			}
		}
	}
}
