package org.testing.responseValidation;

import io.restassured.response.Response;

public class responseDataValidate {
	
	public static void responseData(Response res, String expectedData, String jsonPath) {
		
		if(res.jsonPath().get(jsonPath).equals(expectedData)) {
			System.out.println("Data is matching");
		}
		else {
			System.out.println("Data is not matching");
		}
		
	}

}
