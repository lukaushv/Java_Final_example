import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class Paxmelia {
        public static void CreateXML() throws ParserConfigurationException, TransformerException {

            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();

            Element order =document.createElement("order");
            document.appendChild(order);

            Element item = document.createElement("item");
            Element name = document.createElement("name");
            Element credit = document.createElement("credit");
            credit.appendChild(document.createTextNode("ostri"));
            name.appendChild(document.createTextNode("15"));
            item.appendChild(name);
            item.appendChild(credit);

            Element item2 = document.createElement("item");
            Element name2 = document.createElement("name");
            Element credit2 = document.createElement("credit");
            name2.appendChild(document.createTextNode("chaqafuli"));
            credit2.appendChild(document.createTextNode("18"));
            item2.appendChild(name2);
            item2.appendChild(credit2);

            Element item3 = document.createElement("item");
            Element name3 = document.createElement("name");
            Element credit3 = document.createElement("credit");
            credit3.appendChild(document.createTextNode("msxlis limonati"));
            name3.appendChild(document.createTextNode("2"));
            item3.appendChild(credit3);
            item3.appendChild(name3);

            order.appendChild(item);
            order.appendChild(item2);
            order.appendChild(item3);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);

            StreamResult streamResult = new StreamResult(new File("paxmelia.xml"));
            transformer.transform(domSource,streamResult);
        }

         static void parseXml() throws ParserConfigurationException, IOException, SAXException {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("paxmelia.xml"));
        doc.getDocumentElement().normalize();
        NodeList nodeList = doc.getElementsByTagName("subject");
        int sum = 0;
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            Element element = (Element) node;
            String name = element.getElementsByTagName("name").item(0).getTextContent();
            String credit = element.getElementsByTagName("credit").item(0).getTextContent();
            System.out.println(credit);
            Integer.getInteger(credit);
            sum += Integer.parseInt(credit);
        }
        System.out.println(sum);
    }
}

