package homework4;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class XMLUtil {
    public static Object getBean(){
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document;
            document = documentBuilder.parse("src/homework4/config.xml");

            NodeList nodeList = document.getElementsByTagName("className");
            Node classNode = nodeList.item(0).getFirstChild();
            String cName = classNode.getNodeValue();

            Class c = Class.forName(cName);
            Object object = c.newInstance();
            return object;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
        }
}
