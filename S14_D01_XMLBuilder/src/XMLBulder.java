import java.io.DataOutputStream;
import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;



public class XMLBulder {

	public static void main(String[] args) throws ParserConfigurationException {
		DocumentBuilder docReader = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document xmldoc = docReader.newDocument();
		
		Element root = xmldoc.createElement("users");
		Element user = xmldoc.createElement("user");
		
		user.setAttribute("username", "john");
		user.setAttribute("password", "1234");
		
		root.appendChild(user);
		
		user = xmldoc.createElement("user");
		user.setAttribute("username", "doe");
		user.setAttribute("password", "14321");
		
		root.appendChild(user);
		xmldoc.appendChild(root);
		
		//pravilo za ispis svaki put kada nadje child node da odovoji ddva mjesta
		
		
		DOMSource source = new DOMSource(xmldoc);
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer;
		try {
			transformer = transformerFactory.newTransformer();
			StreamResult result =  new StreamResult(new DataOutputStream(System.out));
			transformer.transform(source, result);
		} catch (TransformerConfigurationException e) {
			
			e.printStackTrace();
		} catch (TransformerException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
