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
	static Health health = null;
	static URI uri = null;
	static URI uriAdapter = null;
	static String type = "";
	static Integer idPerson = null;




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

	public static URI getUriAdapter() {
		return uriAdapter;
	}

	public static void setUriAdapter(URI uriAdapter) {
		Client.uriAdapter = uriAdapter;
	}


}
