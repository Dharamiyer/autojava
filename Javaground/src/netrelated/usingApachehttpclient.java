package netrelated;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;


public class usingApachehttpclient {

	public static void main(String[] args) {
		try {

			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet("http://headers.jsontest.com/");
			HttpResponse response = client.execute(request);
			
			
			
			
			//This portion checks for the presence of a specific entry in the body
			
			HttpEntity entity = response.getEntity();
			String responseString = EntityUtils.toString(entity, "UTF-8");
			System.out.println(responseString);
			if (responseString.contains("headers.jsontesto.com")) {
				System.out.println("Kunjithapaadham");
			}
			else {
				System.out.println("Ranjithapaadham");
			}
			
			
			
			

			System.out.println("Printing Response Header...\n");

			Header[] headers = response.getAllHeaders();
			for (Header header : headers) {
				System.out.println("Key : " + header.getName()
		                           + " ,Value : " + header.getValue());

			}

			System.out.println("\nGet Response Header By Key ...\n");
			String server = response.getFirstHeader("Server").getValue();

			if (server == null) {
				System.out.println("Key 'Server' is not found!");
			} else {
				System.out.println("Server - " + server);
			}

			System.out.println("\n Done");

		    } catch (Exception e) {
			e.printStackTrace();
		    }
	}

}
