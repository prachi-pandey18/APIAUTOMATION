package org.testing.utilities;

import io.restassured.response.Response;

public class responseExtractionJSONPath {
	
	
	public static String responseExtract(String jsonPath, Response res) {
		
		
		return res.jsonPath().get(jsonPath);
		
		
	}
	

}
