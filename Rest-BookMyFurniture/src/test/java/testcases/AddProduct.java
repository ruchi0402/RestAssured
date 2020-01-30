package testcases;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AddProduct {
	
	@SuppressWarnings("unchecked")
	@Test
	public void testcaseone()
	{
	RequestSpecification request = RestAssured.given();
	request.header("Content-Type", "application/json");
	JSONObject requestParams = new JSONObject();
	requestParams.put("availability", "true"); 
	requestParams.put("categoryId", 4);
	requestParams.put("color", "white");
	requestParams.put("createdOn", "2019-08-01");
	requestParams.put("description", "youll never leave");
	requestParams.put("discount", 10);
	requestParams.put("materialDescription", "soft cotton, sandal Wood");
	requestParams.put("name", "Tacoma kingbed");
	requestParams.put("price", 24000);
	requestParams.put("updateOn",  "2019-09-01");
	requestParams.put("warranty",  10);
	request.body(requestParams.toJSONString());
	Response response = request.post("http://okmry52647dns.eastus.cloudapp.azure.com:8089/rest/api/product/");	 
	//System.out.println("Response body: " + response.body().asString());
	int statusCode = response.getStatusCode();
	Assert.assertEquals(statusCode, 201);
	
	
	}	

}
