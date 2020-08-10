package org.testing.testScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.responseValidation.responseDataValidate;
import org.testing.responseValidation.responseStatusCodeValidate;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.propertiesFileLoad;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class patchRequestTestCase {
	
	@Test	
	public void patchRequest() throws IOException {
		
		
		JSONObject object = new JSONObject();
		
		
		String body= object.put("firstname", "SuperMan_Patch_1").toString();
		
		Properties pr= propertiesFileLoad.propertiesFile();

		HTTPMethods method= new HTTPMethods(pr);
		
		Response res= method.patchRequest("QA_Uri", body, postRequestTestCase.id);
		//System.out.print(res);
		
		System.out.println("Patch response is as follows" +res.asString());
		responseStatusCodeValidate.statusCode(res, 200);
		responseDataValidate.responseData(res, "SuperMan_Patch_1", "firstname");
		
		
		
	}
	
	

}
