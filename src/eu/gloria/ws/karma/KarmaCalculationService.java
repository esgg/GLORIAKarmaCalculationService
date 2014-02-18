package eu.gloria.ws.karma;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;

public class KarmaCalculationService implements ServletContextListener{
	
	 private final ScheduledExecutorService scheduler =    Executors.newScheduledThreadPool(1);
	 
	 
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("Closing model...");
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("Initializing model...");
		
//	Client client = Client.create();
//		
//		client.addFilter(new HTTPBasicAuthFilter("user", "password"));
//		
//		WebResource webResource = client.
//			resource("http://ws.users.gloria-project.eu:8080/GLORIAAPI/logs/info/today");
//		
//		
//		ClientResponse response = webResource.accept("application/json")
//                .get(ClientResponse.class);
//		
//		
//		
//		if (response.getStatus() != 200) {
//			   throw new RuntimeException("Failed : HTTP error code : "
//				+ response.getStatus());
//			}
//	 
//		String output = response.getEntity(String.class);
//		System.out.println("Output from Server .... \n");
//		System.out.println(output);
	}

}
