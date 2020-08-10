package org.testing.testSteps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONString;

public class HTTPMethods {
	
	Properties pr;
	
	public HTTPMethods(Properties pr) {
		 
		this.pr=pr;
		
	}
	
	
	
	public Response Post(String body, String uriKey) {
		
		
		Response res=given().contentType(ContentType.JSON).body(body).when().post(pr.getProperty(uriKey));
		
		return res;
		
	}
	
	public Response GetRequest(String uriKey) {
		
		Response res=given().contentType(ContentType.JSON).when().get(pr.getProperty(uriKey));
		
		
		return res;
		
	}
	public Response GetRequestEndPoint(String uriKey, String endPoint) {
		
		String uri=pr.getProperty(uriKey)+"/"+endPoint;
		System.out.println(uri);
		Response res=given().contentType(ContentType.JSON).when().get(uri);
		
		return res;
		
	}
	public Response GetRequestQueryParams(String uriKey, String parameter, String value) {
		
		String uri=pr.getProperty(uriKey)+"?"+parameter+"="+value;
		System.out.println(uri);
		Response res=given().contentType(ContentType.JSON).when().get(uri);
		
		return res;
		
	}
	public Response putRequest(String uriKey, String body, String endPoint) {
		
		String uri=pr.getProperty(uriKey)+"/"+endPoint;
		System.out.println("Uri created "+uri);
		
		
		Response res=given().contentType(ContentType.JSON).body(body).when().put(uri);
		
		return res;
		
		
	}
	public Response deleteRequest(String uriKey, String endPoint) {
		
		String uri=pr.getProperty(uriKey)+"/"+endPoint;
		
		System.out.println("Uri created "+uri);
		
		
		
		Response res=given().contentType(ContentType.JSON).when().delete(uri);
		
		return res;
		
	}
	
	public Response patchRequest(String uriKey, String body, String endPoint ) {
		
		String uri=pr.getProperty(uriKey)+"/"+endPoint;
		System.out.println("Uri created "+uri);
		
		
		Response res=given().contentType(ContentType.JSON).body(body).when().patch(uri);
		
		return res;
		
		
		
	}
	
	
	
	

}
