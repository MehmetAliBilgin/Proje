import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class Receipt_List_Demo {
	public static void main(String[] args) throws Exception {
	
	         
	         DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
	         Document document = documentBuilder.parse(new File("src\\resources\\Sales.xml"));
	         NodeList bNodes = document.getElementsByTagName("Receipt");
	         List anodes = new ArrayList();
	         for(int i = 0; i < bNodes.getLength(); i++) {
	             Element bElement = (Element) bNodes.item(i).getChildNodes();
	             NodeList cNodes = bElement.getElementsByTagName("Total");
	             //System.out.println(bElement.getElementsByTagName("Total").item(0).getTextContent());
	             // ...	  
	             return integer.parseInt(bElement.getElementsByTagName("Total").item(0).getTextContent());
	             sort(integer);
	         }
	              
	         
	         
	         for(int i: sorted)
	         System.out.println(i);
	
	}
	
	
	     
	         public static int[] sort(int[] input) {
	             int count = 0;
	             for(int i=0; i<input.length; i++){
	                 
	                 if(i<input.length - 1)
	                 {
	                     if(input[i]>input[i+1]){
	                         int temp=input[i];
	                         input[i]=input[i+1];
	                         input[i+1]=temp;    
	                     }
	                 }
	                 
	                 if(i == input.length - 1) {
	                 count++;
	                     i = -1;
	                     if(count == input.length - 1)
	                         break;
	                 }
	             }        
	             
	             return input;
	         }
	         
	         
	     
	         //System.out.println(((NodeList) anodes.get(2)).item(2).getTextContent());                  
}

