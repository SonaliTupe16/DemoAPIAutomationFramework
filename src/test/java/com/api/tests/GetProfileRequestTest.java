package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.ProfileResponse;

import io.restassured.response.Response;

public class GetProfileRequestTest {
	
	@Test
	public void getProfileInfoTest() {
		
		AuthService authService = new AuthService();
		Response response = authService.login(new LoginRequest("sonalinikam16","Bluemoon@1611"));
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(loginResponse.getToken());
		
		UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
		 response = userProfileManagementService.getProfile(loginResponse.getToken());
		 System.out.println(response.asPrettyString());
		 
		 ProfileResponse profileResponse = response.as(ProfileResponse.class);
		 Assert.assertEquals(profileResponse.getId(),3485 );
		 Assert.assertEquals(profileResponse.getUsername(), "sonalinikam16");
		 Assert.assertEquals(profileResponse.getEmail(), "sonalinikam16@gmail.com");


	}

}
