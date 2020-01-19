package dom;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;

public class DomParser {
public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	DocumentBuilder builder = factory.newDocumentBuilder();
	Document document = builder.parse(new File("employees.xml"));
	document.getDocumentElement().normalize();
	Element root = document.getDocumentElement();
	System.out.println(root.getNodeName());
	NodeList nList = document.getElementsByTagName("employee");
	System.out.println("============================");
	 
	for (int temp = 0; temp < nList.getLength(); temp++)
	{
	 Node node = nList.item(temp);
	 System.out.println("");   
	 if (node.getNodeType() == Node.ELEMENT_NODE)
	 {
	    Element eElement = (Element) node;
	    System.out.println("Employee id : "    + eElement.getAttribute("id"));
	    System.out.println("First Name : "  + eElement.getElementsByTagName("firstName").item(0).getTextContent());
	    System.out.println("Last Name : "   + eElement.getElementsByTagName("lastName").item(0).getTextContent());
	    System.out.println("Location : "    + eElement.getElementsByTagName("location").item(0).getTextContent());
System.out.println("company: "    + eElement.getElementsByTagName("company").item(0).getTextContent());
	 }
	 
	 System.out.println(((root.getFirstChild().getNodeValue())));
	 
	 
	}
}
}
