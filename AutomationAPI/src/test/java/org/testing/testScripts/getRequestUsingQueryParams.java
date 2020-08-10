package org.testing.testScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.responseValidation.responseStatusCodeValidate;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.propertiesFileLoad;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class getRequestUsingQueryParams {
	@Test
public void TestCaseGetQueryParams() throws IOException {
		
		Properties prop= propertiesFileLoad.propertiesFile();
		
		HTTPMethods http= new HTTPMethods(prop);
		
		Response res= http.GetRequestQueryParams("QA_Uri", "profileUser",postRequestTestCase.profileUser);		
		
		System.out.println("response with query param is" +res.asString());
		
		responseStatusCodeValidate.statusCode(res, 200);
		
		//responseDataValidate.responseData(res, "2020", "[2].Year");
		
		
	}

}
