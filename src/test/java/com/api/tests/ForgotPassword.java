package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;

import io.restassured.response.Response;

public class ForgotPassword {
	
	@Test(description = "Verify if login API is working...")
	public void forgotPassword() {
		AuthService authService  = new AuthService();
		Response response = authService.forgotPassword("sonalinikam16@gmail.com");
		System.out.println(response.asPrettyString());

}
}