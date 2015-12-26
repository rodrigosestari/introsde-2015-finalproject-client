package userinterface;

import java.net.URI;
import java.net.URL;
import java.util.Scanner;

import javax.ws.rs.core.UriBuilder;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import systemlogic.processcentricservices.soap.client.EndPoint;
import systemlogic.processcentricservices.soap.sw.Health;
import systemlogic.processcentricservices.soap.sw.MeasureHistoryView;
import systemlogic.processcentricservices.soap.sw.PersonDto;

public class Client {

	static URL url = null;
	static QName qname = null;
	static Service service = null;
	static Health health = null;
	static URI uri = null;
	static String type = "";
	static Integer idPerson = null;

	public static void main(String[] args) throws Exception {
		setUrl(new URL("http://rodrigo-sestari-final-soap.herokuapp.com/ws/health?wsdl"));
		setQname(new QName("http://sw.soap.processcentricservices.systemlogic/", "HealthService"));
		setService(Service.create(url, qname));
		setHealth(getService().getPort(Health.class));
		setUri(UriBuilder.fromUri("http://rodrigo-sestari-final-rest.herokuapp.com/finalprojectrest/").build());

		System.out.println("Rodrigo Joni Sestari");
		String input = "";
		while (!input.equals("exit")) {
			if (null == idPerson) {
				System.out.println("1 - List id all People");
				System.out.println("2 - Enter person");
				System.out.println("3 - exit");
				type = scanner();
				switch (type) {

				case "1": {
					System.out.println(EndPoint.idPeople());
				}
					break;
				case "2": {
					System.out.print("Person id: ");
					type = scanner();
					try {
						PersonDto p = EndPoint.peopleExist(Long.parseLong(type));
						if (null != p) {
							idPerson = p.getIdPerson();
						}
					} catch (Exception e) {
						idPerson = null;
						input = "exit";
					}

				}
					break;
				case "3": {
					input = "exit";
				}
					break;
				default:
					input = "exit";
					break;
				}
			} else {
				System.out.println("1 - get measute history");
				System.out.println("2 - get measute types");
				System.out.println("3 - exit");
				type = scanner();
				switch (type) {

				case "1": {
					System.out.print("measure: ");
					String pmeasure = scanner();
					try {
						MeasureHistoryView mv = EndPoint.personHistory(Long.valueOf(idPerson), pmeasure);
						if (null != mv) {
							for (MeasureHistoryView.Measure m : mv.getMeasure()) {
								System.out.println(m.toString());
							}

						}
					} catch (Exception e) {

					}

				}
					break;
				case "2": {
					System.out.println(EndPoint.measureType());
				}
					break;
				case "3": {
					input = "exit";
				}
					break;
				default:
					input = "exit";
					break;
				}
			}

		}

	}

	public static String scanner() {
		Scanner input = new Scanner(System.in);
		String writeSomething = input.nextLine();
		return writeSomething;
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
