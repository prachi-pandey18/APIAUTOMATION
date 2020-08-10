package org.testing.testScripts;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import org.json.simple.parser.*;




public class readPayload1Json {

	
	public static void main(String args[]) throws IOException, ParseException {
		

//		String JSON="../AutomationAPI/payload1.json";
//		JSONObject jsonObject =new JSONObject(JSON);
//		JSONArray jsonArray = jsonObject.getJSONArray("Devices");
//		for(int i=0;i<jsonArray.length();i++){
//		    JSONObject json = jsonArray.getJSONObject(i);
//		    String DeviceID = json.getString("DeviceID");
//		    String DeviceModel=json.getString("DeviceModel");
//		    String SerialNumber=json.getString("SerialNumber");
//		    String Status=json.getString("Status");
//		    System.out.println("Device id is" +DeviceID+ ","+ "Device Model is" + DeviceModel +"," + "Serial Number is" +SerialNumber 
//		    		+"and status is " + Status);
//		    }
		
		FileReader reader = new FileReader("../AutomationAPI/payload1.json");
	    JSONParser parser = new JSONParser() ;
	    JSONObject object = (JSONObject) parser.parse(reader);
	    JSONArray deviceListFromJSON = (JSONArray) object.get("Devices");
	    reader.close();
	    for (int i = 0; i < deviceListFromJSON.size(); i++) {
	        JSONObject devices = (JSONObject) deviceListFromJSON.get(i);
	        System.out.println(devices);
	       
	    }   
	    
		
		
		
		
	}
	
}
