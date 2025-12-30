package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class AccountCreationTest {

	@Test(description = "Verify if login API is working...")
	public void createAccountTest() {

		SignUpRequest signUpRequest = new SignUpRequest.Builder().userName("Shaarvi110").email("shaarvi10@yahoo.com")
				.firstName("Shaarvi").password("Shaarvi123").lastName("Tupe").mobileNumber("7777777776").build();

		AuthService authService = new AuthService();
		Response response = authService.signUp(signUpRequest);
		
	    response.then().log().all();
	    Assert.assertEquals(response.getStatusCode(), 200);

		Assert.assertEquals(response.asPrettyString(), "User registered successfully!");

	}

}
