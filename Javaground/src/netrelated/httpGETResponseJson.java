package netrelated;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class httpGETResponseJson {
	private final String USER_AGENT = "Mozilla/5.0";
	public static void main(String[] args)throws Exception {
		httpGETResponseJson http = new httpGETResponseJson();

		System.out.println("Testing 1 - Send Http GET request");
		http.sendGet();

		/*System.out.println("\nTesting 2 - Send Http POST request");
		http.sendPost();*/

	}
	
	// HTTP GET request
		private void sendGet() throws Exception {

			//String url = "http://www.google.com/search?q=mkyong";
			String url = "http://headers.jsontest.com/";

			URL obj = new URL(url);
			HttpURLConnection don = (HttpURLConnection) obj.openConnection();

			// optional default is GET
			don.setRequestMethod("GET");

			//add request header
			don.setRequestProperty("User-Agent", USER_AGENT);

			System.out.println("\nSending 'GET' request to URL : " + url);
			int responseCode = don.getResponseCode();
			
			System.out.println("Response Code : " + responseCode);

			BufferedReader in = new BufferedReader(
			        new InputStreamReader(don.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			//print result
			System.out.println(response.toString());

	}

}
