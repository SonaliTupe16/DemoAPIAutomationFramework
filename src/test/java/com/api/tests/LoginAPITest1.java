package com.api.tests;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginAPITest1 {
	
@Test(description ="Verify if login API is working...")
	
	public void loginTest() {
	/*Map<String, String> payload = new HashMap<>();
    payload.put("username", "sonalinikam16");
    payload.put("password", "Bluemoon@1611");*/
	Response response = given().baseUri("http://64.227.160.186:8080")
				.header("Content-Type" , "application/json")
				.body("{\"username\": \"sonalinikam16\", \"password\": \"Bluemoon@1611\"}").post("/api/auth/login");
		System.out.println(response.asPrettyString());
		
		
		Assert.assertEquals(response.getStatusCode(),200);
	}
}


