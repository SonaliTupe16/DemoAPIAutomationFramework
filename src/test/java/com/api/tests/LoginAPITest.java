package com.api.tests;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginAPITest {
	
	@Test(description ="Verify if login API is working...")
	
	public void loginTest() {
		RestAssured.baseURI="http://64.227.160.186:8080";
		/*Map<String, String> payload = new HashMap<>();
        payload.put("username", "sonalinikam16");
        payload.put("password", "Bluemoon@1611");*/
		RequestSpecification requestSpecification = RestAssured.given();
		RequestSpecification requestSpecification1 = requestSpecification.contentType(ContentType.JSON);
		RequestSpecification requestSpecification2 = requestSpecification1.body("{\"username\": \"sonalinikam16\", \"password\": \"Bluemoon@1611\"}");
		Response response = requestSpecification2.post("/api/auth/login");
		System.out.println(response.asPrettyString());
		
		JsonPath jsonPath = response.jsonPath();
		String actualEmail = jsonPath.getString("email");
		Assert.assertEquals(actualEmail, "sonalinikam16@gmail.com");
		
		Assert.assertEquals(response.jsonPath().getInt("id"), 3485);
		Assert.assertEquals(response.getStatusCode(),200);
	}
}

 
