package systemlogic.processcentricservices.api.publisher;
import java.net.InetAddress;
import java.net.URL;

import javax.ws.rs.core.UriBuilder;
import javax.xml.namespace.QName;
import javax.xml.ws.Endpoint;
import javax.xml.ws.Service;

import systemlogic.processcentricservices.api.sw.ApiImpl;
import systemlogic.processcentricservices.soap.sw.Health;


public class ApiPublisher {
	
	public static void main(String[] args) throws Exception {
        String PROTOCOL = "http://";
        String HOSTNAME = InetAddress.getLocalHost().getHostAddress();
        if (HOSTNAME.equals("127.0.0.1"))
        {
            HOSTNAME = "localhost";
        }
        String PORT = "6902";
        String BASE_URL = "/ws/api";

        if (String.valueOf(System.getenv("PORT")) != "null"){
            PORT=String.valueOf(System.getenv("PORT"));
        }
         
        //soap entry point
        systemlogic.processcentricservices.interfaces.Client.setUrl(new URL("http://rodrigo-sestari-final-soap.herokuapp.com/ws/health?wsdl"));
        systemlogic.processcentricservices.interfaces.Client.setQname(new QName("http://sw.soap.processcentricservices.systemlogic/", "HealthService"));		                    
        systemlogic.processcentricservices.interfaces.Client.setService(Service.create(systemlogic.processcentricservices.interfaces.Client.getUrl(), systemlogic.processcentricservices.interfaces.Client.getQname()));
        systemlogic.processcentricservices.interfaces.Client.setHealth(systemlogic.processcentricservices.interfaces.Client.getService().getPort(Health.class));
        //rest project base
        systemlogic.processcentricservices.interfaces.Client.setUri(UriBuilder.fromUri("http://rodrigo-sestari-final-rest.herokuapp.com/finalprojectrest/").build());
        //rest adapter
        systemlogic.processcentricservices.interfaces.Client.setUriAdapter(UriBuilder.fromUri("http://rodrigo-sestari-final-api.herokuapp.com/adapter/").build());
		
        String endpointUrl = PROTOCOL+HOSTNAME+":"+PORT+BASE_URL;
        System.out.println("Starting API Service...");
        System.out.println("--> Published. Check out "+endpointUrl+"?wsdl");
        Endpoint.publish(endpointUrl, new ApiImpl());
    }
}
