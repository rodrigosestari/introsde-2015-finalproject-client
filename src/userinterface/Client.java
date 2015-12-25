package userinterface;

import java.net.URI;
import java.net.URL;

import javax.ws.rs.core.UriBuilder;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import systemlogic.processcentricservices.soap.sw.Health;

public class Client {

	static URL url = null;
	static QName qname = null;
	static Service service = null;
	static Health health =null;
	static URI  uri= null;
	

	public static void main(String[] args) throws Exception {
		setUrl(new URL("http://rodrigo-sestari-final-soap.herokuapp.com/ws/people?wsdl"));
		setQname(new QName("http://sw.soap.processcentricservices.systemlogic", "Health"));
		setService(Service.create(url, qname));
		setHealth(getService().getPort(Health.class));
		setUri(UriBuilder.fromUri("http://rodrigo-sestari-final-rest.herokuapp.com/finalprojectrest/").build());
		
		

	}
	
	public static URL getUrl() {
		return url;
	}


	public static QName getQname() {
		return qname;
	}


	public static Service getService() {
		return service;
	}


	public static Health getHealth() {
		return health;
	}


	public static void setUrl(URL url) {
		Client.url = url;
	}


	public static void setQname(QName qname) {
		Client.qname = qname;
	}


	public static void setService(Service service) {
		Client.service = service;
	}


	public static void setHealth(Health health) {
		Client.health = health;
	}

	public static URI getUri() {
		return uri;
	}

	public static void setUri(URI uri) {
		Client.uri = uri;
	}


}