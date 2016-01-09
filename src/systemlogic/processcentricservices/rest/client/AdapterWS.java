package systemlogic.processcentricservices.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;

public class AdapterWS {

	static ClientConfig clientConfig = new ClientConfig();
	static Client client = ClientBuilder.newClient(clientConfig);

	public static boolean importMeasure(int idperson, String token) {

		boolean result = false;
		try {
			WebTarget service = client.target(userinterface.Client.getUriAdapter()).path("adapter/" + idperson + "/" + token);
			Response response = service.request(MediaType.APPLICATION_XML).accept(MediaType.APPLICATION_XML).get();
			String xml = response.readEntity(String.class);
			int httpStatus = response.getStatus();
			xml = response.readEntity(String.class);

			if (httpStatus == 200)
				result = true;

		} catch (Exception e) {
			result = false;
		}

		return result;

	}

}
