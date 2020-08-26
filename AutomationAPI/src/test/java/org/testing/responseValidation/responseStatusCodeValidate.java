package org.testing.responseValidation;

import org.testing.utilities.logsCapture;

import io.restassured.response.Response;

public class responseStatusCodeValidate {
	
	public static void statusCode(Response res, int expectedStatusCode) {
		
		if (res.getStatusCode()==expectedStatusCode) {
			
			//System.out.println("Status Code is matching");
			logsCapture.takeLogs("responseStatusCodeValidate", "Status Code is matching");
		}
		else {
			//System.out.println("Status Code is not matching");
			logsCapture.takeLogs("responseStatusCodeValidate", "Status Code is not matching");
		}
	}

}
