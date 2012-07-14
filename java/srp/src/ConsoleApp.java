import java.io.File;
import java.io.PrintStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ConsoleApp {

	public static void main(String[] args) {
		PrintStream console = System.out;

		try {
			File xmlFile = new File(".\\bin\\sample.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(xmlFile);
			doc.getDocumentElement().normalize();

			console.println("Root element: " + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("product");
			console.println("-----------------------");

			for (int temp = 0; temp < nodeList.getLength(); temp++) {
				Node node = nodeList.item(temp);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element)node;
					console.println("Id: " + getTagValue("id", eElement));
					console.println("Name: " + getTagValue("name", eElement));
					console.println("Unit price: " + getTagValue("unitPrice", eElement));
					console.println("Discontinued: " + getTagValue("discontinued", eElement));
					console.println("-----------------------");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.exit(0);
	}

	private static String getTagValue(String sTag, Element eElement) {
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
		Node nValue = (Node)nlList.item(0);
		return nValue.getNodeValue();
	}
}