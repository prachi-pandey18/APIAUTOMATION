package org.testing.testScripts;


import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.responseValidation.responseDataValidate;
import org.testing.responseValidation.responseStatusCodeValidate;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JSONVariableReplacement;
import org.testing.utilities.JsonFileRead;
import org.testing.utilities.propertiesFileLoad;
import org.testing.utilities.responseExtractionJSONPath;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class postRequestTestCase {
	
	static String id;
	static String profileUser;
	static Response res;
	
	@Test
	public  void postRequestTC ()throws IOException {
		
		String body=JsonFileRead.bodyDataRead("../AutomationAPI/src/test/java/org/testing/payloadData/body.json");
		Random random= new Random();
		Integer randomNumber= random.nextInt();
		
		body=JSONVariableReplacement.replace(body, "id", randomNumber.toString());
		System.out.println(body);
		
		Properties prop= propertiesFileLoad.propertiesFile();
		
		HTTPMethods method= new HTTPMethods(prop);
		res=method.Post(body, "QA_Uri");
		//System.out.println(res.asString());
		responseStatusCodeValidate.statusCode(res, 201);
		
		
		responseDataValidate.responseData(res, "Prachi Pandey", "profileUser");
		
		id = responseExtractionJSONPath.responseExtract("id", res);
		
		profileUser= responseExtractionJSONPath.responseExtract("profileUser", res);
		
		
//		Response res=method.Post(body, "QA_Uri");
//			System.out.println("Response is" + res.asString());
//			System.out.println("Status code is" +res.getStatusCode());
		
	}

}
