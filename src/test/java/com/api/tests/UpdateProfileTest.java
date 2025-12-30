package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

@Test
public class UpdateProfileTest {

	AuthService authService = new AuthService();
	Response response = authService.login(new LoginRequest("sonalinikam16", "Bluemoon@1611"));
	LoginResponse loginResponse = response.as(LoginResponse.class);
	
	UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
	userProfileManagementService.getProfile(loginResponse.getToken());

}
