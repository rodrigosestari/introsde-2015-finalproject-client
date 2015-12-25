package systemlogic.processcentricservices.rest.client;

import java.io.StringReader;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.glassfish.jersey.client.ClientConfig;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;



public class GoalWS {

	static ClientConfig clientConfig = new ClientConfig();
	static Client client = ClientBuilder.newClient(clientConfig);

	
	
	public static void getGoals(int idperson){
	
		WebTarget service = client.target(userinterface.Client.getUri()).path("goal/" + idperson);
		Response response = service.request(MediaType.APPLICATION_XML).accept(MediaType.APPLICATION_XML).get();
	
	}
	
	public static NodeList getNodes(String source, String query) throws Exception {
		NodeList nl = null;
		try {
			if (!source.isEmpty()){
				InputSource input_source = new InputSource(new StringReader(source));

				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
				DocumentBuilder db = dbf.newDocumentBuilder();
				org.w3c.dom.Document document = db.parse(input_source);

				XPathFactory xpathFactory = XPathFactory.newInstance();
				XPath xpath = xpathFactory.newXPath();

				nl = (NodeList) xpath.evaluate(query, document, XPathConstants.NODESET);
			}
		} catch (Exception e) {
			nl =null;
		}

		return nl;
	}




	
/*
	public static void request1() throws IOException, JSONException, Exception {


	

		write("\n \n Request #1: GET ["+service.getUri().getPath()+"] Accept: APPLICATION_XML Content-type: APPLICATION_XML");

		Response response = service.request(MediaType.APPLICATION_XML).accept(MediaType.APPLICATION_XML).get();
		int httpStatus =response.getStatus();     		
		String xml = response.readEntity(String.class);


		NodeList n = getNodes(xml, "//person");
		if (n.getLength() > 2) {
			write("=> Result:OK"); 
		} else {
			write("=> Result:ERROR");
		}

		NodeList n1 = getNodes(xml, "//person[1]/idPerson/text()");
		firstPerson = Integer.parseInt(n1.item(0).getNodeValue());
		NodeList n2 = getNodes(xml, "//person[last()]/idPerson/text()");
		lastPerson = Integer.parseInt(n2.item(0).getNodeValue());

		write("=> HTTP Status: " +httpStatus);
		write(xml);

	}


	public static void request3() throws Exception {


		ClientConfig clientConfig = new ClientConfig();
		Client client = ClientBuilder.newClient(clientConfig);
		WebTarget service = client.target(getBaseURI()).path("person/"+firstPerson);

		write("\n \n Request #3: [PUT] ["+service.getUri().getPath()+"] Accept: APPLICATION_XML Content-type: APPLICATION_XML");

	
		NodeList nl = getNodes(xmlFistPerson, "//firstname/text()");
		String name = nl.item(0).getNodeValue();
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String newname = dateFormat.format(new Date());
		xmlFistPerson = xmlFistPerson.replace(name,  "Changed_XML at "+newname);

		write(xmlFistPerson);
		Response response = service.request(MediaType.APPLICATION_XML).accept(MediaType.APPLICATION_XML).put(Entity.xml(xmlFistPerson));
		int httpStatus =response.getStatus(); 
		String xml = response.readEntity(String.class);

		if ((httpStatus == 201)){ //created
			write("=> Result:OK");
		}else{
			write("=> Result:ERROR");
		}

		write("=> HTTP Status: " +httpStatus);
		write(xml);

	}

*/
}