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

	
	@SuppressWarnings("unchecked")
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
	    JSONArray DeviceModels = (JSONArray) object.get("DeviceModels");
	    reader.close();
	    for (int i = 0; i < DeviceModels.size(); i++) {
	        JSONObject models = (JSONObject) DeviceModels.get(i);
	        
	        if (models.get("BrandName").toString().equals("") && models.get("Config").toString().equals("")
	        		&& models.get("ModelNameValue").toString().equals("")) {
	        	models.put("Config", "64GB");
	        	models.put("BrandName", "Samsung");
	        	models.put("ModelNameValue", "M30");
	        	
	        }
	        System.out.println(models);
	       
	    }   
	    
		
		
		
		
	}
	
}
