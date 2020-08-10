package org.testing.testScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.responseValidation.responseStatusCodeValidate;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.propertiesFileLoad;
import org.testng.annotations.Test;

import io.restassured.response.Response;



public class deleteRequestTestCase {
	@Test
	public void deleteRequestTC() throws IOException{
	
	Properties pr= propertiesFileLoad.propertiesFile();
	
	HTTPMethods method= new HTTPMethods(pr);
	
	Response res = method.deleteRequest("QA_Uri", postRequestTestCase.id);
	//System.out.print(res);
	
	responseStatusCodeValidate.statusCode(res, 200);
	
	
	}
	
	
	
	
	
}
