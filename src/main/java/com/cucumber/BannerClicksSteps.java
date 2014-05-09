package com.cucumber;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;


import org.json.JSONException;
import org.json.JSONObject;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;


 
public class BannerClicksSteps {
 
	final Logger logger = LoggerFactory.getLogger(BannerClicksSteps.class);
	private String imdb_url;
	private JSONObject json_response;
	private int click_response;
	
	@Given("^I click a banner by \"(.*)?\"$")
	public void I_click_a_banner_title(String key) throws UnsupportedEncodingException {
		//imdb_url = "http://imdbdapi.org/?title=" + URLEncoder.encode(key, "UTF-8") + "&type=json";
		imdb_url="http://1sdk-adp-api-dev1.elasticbeanstalk.com/ap/cw?partner-id=48&click-id="+key+"&package-name=hello&redirect-uri=http://example.com";
		logger.info("http query = " + imdb_url);
	}
 
	@When("^I get the rest response$")
	public void I_make_the_rest_call() throws IOException, JSONException {
		click_response = JsonReader.readJsonFromUrl1SDK(imdb_url);
		logger.info("Response = " + click_response);
	}
 
	@Then("^response should contain:$")
	public void response_should_contain_JSON(String expected_response_str) throws JSONException {
		logger.info("Comparing reponse with " + expected_response_str);
		//JSONObject expected_json = new JSONObject(expected_json_str);
		//assertEquals("response 200", 200, click_response);
		assertTrue("The balance is not zero.", click_response == 200);
	}
	


	@Then("^response should contain \"(.+)\"")
	public void response_should_contain(String expecgted_json_str) throws JSONException {
		response_should_contain_JSON(expecgted_json_str);
	}
}