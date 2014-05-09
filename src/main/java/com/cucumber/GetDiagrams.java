package com.cucumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;

import com.sun.net.httpserver.HttpContext;


/**
 * Hello world!
 *
 */
public class GetDiagrams 
{
    public static void main( String[] args ) throws Exception
    {
    	String url = "http://1sdk-cbi-api-dev1.elasticbeanstalk.com/cbi/diagrams/clicks-per-campaign-per-publisher?from=2013-11-11&till=2014-12-12";
    	 
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
 
		// optional default is GET
		con.setRequestMethod("GET");
		con.setRequestProperty("Authorization","foo");
		con.setRequestProperty("1sdk-app-package-name","com.rovio.angrybirds");
		//con.setRequestProperty("Content-Type","text/xml");
		//add request header
		//con.setRequestProperty("User-Agent", "Mozilla/5.0");

		int responseCode = con.getResponseCode();
		System.out.println(con.getContentEncoding());
		System.out.println(con.getResponseMessage());
		//System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);
 
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
 
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		System.out.println(response);
		System.out.println("Printing Response Header...\n");
		Map<String, List<String>> map = con.getHeaderFields();
		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			//System.out.println("Key : " + entry.getKey() 
	                   //        + " ,Value : " + entry.getValue());
		}
	 
		//System.out.println("\nGet Response Header By Key ...\n");
		//print result
		//System.out.println(response);
		String server = con.getHeaderField("Server");
		if (server == null) {
			//System.out.println("Key 'Server' is not found!");
		} else {
			//System.out.println("Server - " + server);
		}
	 
		//System.out.println("\n Done");
 
    }
}
