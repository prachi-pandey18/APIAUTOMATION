package org.testing.testScripts;



import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.propertiesFileLoad;


import io.restassured.response.Response;

public class readKeysUsingKeysets {
	
	public static void main(String args[]) throws IOException {
		Properties prop= propertiesFileLoad.propertiesFile();
		
		HTTPMethods http= new HTTPMethods(prop);
		
		Response res= http.GetRequest("QA_Uri");
		/**For devices- payload1.json**/
//		JSONObject parentObject = new JSONObject(res.asString());
//		JSONArray parentArray = parentObject.getJSONArray("");
//		Iterator<Object> iterator = parentArray.iterator();
//		
//		 while (iterator.hasNext()) {
//	            JSONObject jsonObject = (JSONObject) iterator.next();
//	            
//	            for (String key : jsonObject.keySet()) {
//	                System.out.println(key + ":" + jsonObject.get(key));
//	            }
//	
//		
//	}
	

}
}