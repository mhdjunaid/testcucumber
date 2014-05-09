package com.cucumber;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
 
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
public class JsonReader {
 
  private static String readAll(Reader rd) throws IOException {
		StringBuilder sb = new StringBuilder();
		int cp;
		while ((cp = rd.read()) != -1) {
			sb.append((char) cp);
		}
		return sb.toString();
	}
 
	public static JSONObject readJsonFromUrl(String imdb_url) throws IOException, JSONException {
		URL url = new URL(imdb_url);
		URLConnection uc = url.openConnection();
		
		uc.addRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
		uc.connect();
		InputStream is = uc.getInputStream();
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
			String jsonText = readAll(rd);
			JSONObject json = new JSONObject(jsonText);
			final Logger logger = LoggerFactory.getLogger(JsonReader.class);
			logger.info("Response = " + json);
			
			return json;//There can be more than 1 movies
		} finally {
			is.close();
		}
	}
	
	public static int readJsonFromUrl1SDK(String imdb_url) throws IOException, JSONException {
		String url = "http://1sdk-adp-api-dev1.elasticbeanstalk.com/ap/cw?partner-id=42&click-id=pub001___cpn005___ldp001_mbp&package-name=com.rovio.angrybirds&redirect-uri=http://example.com";
   	 
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
 
		// optional default is GET
		con.setRequestMethod("GET");
 
		//add request header
		con.setRequestProperty("User-Agent", "Mozilla/5.0");
 
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);
        return responseCode;
		
		
	}
	
	
}