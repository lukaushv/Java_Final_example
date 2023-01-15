import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class davaleba4 {

    public static void createXML() throws ParserConfigurationException, TransformerException {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();

        Element subjects = doc.createElement("subjects");
        doc.appendChild(subjects);

        Element subject = doc.createElement("subject");
        subjects.appendChild(subject);
        Element credit = doc.createElement("credit");
        credit.appendChild(doc.createTextNode("5"));
        subject.appendChild(credit);
        Element name = doc.createElement("name");
        name.appendChild(doc.createTextNode("Java"));
        subject.appendChild(name);

        Element subject1 = doc.createElement("subject");
        subjects.appendChild(subject1);
        Element credit1 = doc.createElement("credit");
        credit1.appendChild(doc.createTextNode("8"));
        subject1.appendChild(credit1);
        Element name1 = doc.createElement("name");
        name1.appendChild(doc.createTextNode("Java II"));
        subject1.appendChild(name1);

        Element subject2 = doc.createElement("subject");
        subjects.appendChild(subject2);
        Element credit2 = doc.createElement("credit");
        credit2.appendChild(doc.createTextNode("5"));
        subject2.appendChild(credit2);
        Element name2 = doc.createElement("name");
        name2.appendChild(doc.createTextNode("Android"));
        subject2.appendChild(name2);


        DOMSource domSource = new DOMSource(doc);
        StreamResult streamResult = new StreamResult(new File("davaleba4.xml"));
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(domSource, streamResult);
    }

    public static void parseXml() throws ParserConfigurationException, IOException, SAXException {

        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("davaleba4.xml"));
        doc.getDocumentElement().normalize();
        NodeList nodeList = doc.getElementsByTagName("subject");

        int sum =0;
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            Element element = (Element) node;
            String name = element.getElementsByTagName("name").item(0).getTextContent();
            String credit = element.getElementsByTagName("credit").item(0).getTextContent();
            System.out.println(name + " " + credit);
            Integer.getInteger(credit);

            sum = sum+ Integer.parseInt(credit);

        }
        System.out.println(sum);
    }
}
