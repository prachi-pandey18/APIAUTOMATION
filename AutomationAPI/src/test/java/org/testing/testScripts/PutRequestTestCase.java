package org.testing.testScripts;


import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.json.JSONObject;
import org.testing.responseValidation.responseDataValidate;
import org.testing.responseValidation.responseStatusCodeValidate;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JSONVariableReplacement;
import org.testing.utilities.JsonFileRead;
import org.testing.utilities.propertiesFileLoad;
import org.testing.utilities.responseExtractionJSONPath;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class PutRequestTestCase {
	
	
	@Test
	public void putRequest() throws IOException  {
		
		JSONObject object = new JSONObject(postRequestTestCase.res.asString());
		//System.out.print(object);
		
		object = object.put("firstname", "SuperMan");
		//System.out.print(object);
		Properties pr= propertiesFileLoad.propertiesFile();
		
		System.out.print("JSON Object is" +object);
		
		HTTPMethods method= new HTTPMethods(pr);
		
		Response res=method.putRequest("QA_Uri", object.toString(),postRequestTestCase.id);
		//System.out.print(res);
		responseStatusCodeValidate.statusCode(res, 200);
		responseDataValidate.responseData(res, "SuperMan", "firstname");
		System.out.println("Put response is as follows" +res.asString());

	
	}
	

}
