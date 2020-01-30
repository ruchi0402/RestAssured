package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllProduct {
	
	@Test
	public void getAllProductTest ()
	{
		
		RequestSpecification request = RestAssured.given();
		Response response = request.get("http://okmry52647dns.eastus.cloudapp.azure.com:8089/rest/api/product/all");
		int statusCode = response.getStatusCode();
		//System.out.println("Response body: " + response.body().asString());
		//System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200);
		
		
	}
	
	
	
}

