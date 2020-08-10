package org.testing.utilities;

import java.util.regex.Pattern;

public class JSONVariableReplacement {
	
	
	public static String replace(String body, String variableName, String variableValue) {
		
		body=body.replaceAll(Pattern.quote("{{"+variableName+"}}"), variableValue);
		return body;
	}
	

}
