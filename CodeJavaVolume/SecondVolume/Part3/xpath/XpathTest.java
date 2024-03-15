package CodeJavaVolume.SecondVolume.Part3.xpath;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.catalog.CatalogFeatures;
import javax.xml.catalog.CatalogManager;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class XpathTest {
    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        builder.setEntityResolver(CatalogManager.catalogResolver(CatalogFeatures.defaults(), Paths.get("xpath/catalog.xml").toAbsolutePath().toUri()));
        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xPath = xPathFactory.newXPath();
        try (var in = new Scanner(System.in)) {
            String filename;
            if (args.length == 0) {
                System.out.println("Enter filename: ");
                filename = in.nextLine();
            } else
                filename = args[0];
            Document doc = builder.parse(filename);
            var done = false;
            while (!done) {
                System.out.println("Xpath expression: (empty line to exit)");
                String expression = in.nextLine();
                if (expression.trim().isEmpty()) done = true;
                else {
                    try {

                        XPathEvaluationResult<?> result = xPath.evaluateExpression(expression, doc);
                        if (result.type() == XPathEvaluationResult.XPathResultType.NODESET)
                        {
                            for (Node n: (XPathNodes) result.value()) System.out.println(description(n));
                        }
                        else if(result.type() == XPathEvaluationResult.XPathResultType.NODESET)System.out.println(result.value());
                        else
                            System.out.println(result.value());
                    }
                    catch (XPathExpressionException e){
                        System.out.println(e.getMessage());
                    }
                }

            }

        }

    }

    public static String description(Node n) {
        if (n instanceof Element) return "element" + n.getNodeName();
        else if (n instanceof Attr) return "attribute" + n;
        else return n.toString();
    }
}
