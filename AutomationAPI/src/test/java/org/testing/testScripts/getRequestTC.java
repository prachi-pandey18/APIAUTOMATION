package org.testing.testScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.responseValidation.responseDataValidate;
import org.testing.responseValidation.responseStatusCodeValidate;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.propertiesFileLoad;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class getRequestTC {
	@Test	
	public void TestCaseGet() throws IOException {
		
		Properties prop= propertiesFileLoad.propertiesFile();
		
		HTTPMethods http= new HTTPMethods(prop);
		
		Response res= http.GetRequest("QA_Uri");
		
		Response responseWithEndPoint= http.GetRequestEndPoint("QA_Uri", postRequestTestCase.id);
		
		//System.out.println("response is" +res.asString());
		System.out.println("response with end point is" +responseWithEndPoint.asString());
		
		responseStatusCodeValidate.statusCode(res, 200);
		
		//responseDataValidate.responseData(res, "2020", "[2].Year");
		
		
	}

}
