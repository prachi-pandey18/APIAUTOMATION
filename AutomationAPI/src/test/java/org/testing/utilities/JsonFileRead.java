package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;


public class JsonFileRead {
	
	
	public static String bodyDataRead(String path) throws FileNotFoundException {
		
		File file= new File(path);
		FileReader fr= new FileReader(file);
		JSONTokener js= new JSONTokener(fr);
		JSONObject bodyData= new JSONObject(js);
		return bodyData.toString();
		
	}

}
