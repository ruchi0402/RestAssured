package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.CommonConstant;

public class GetAllProduct {
	
	@Test
	public void getAllProductTest ()
	{
		
		RequestSpecification request = RestAssured.given();
		Response response = request.get(CommonConstant.getURL);
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		
		
	}
	
	
	
}

