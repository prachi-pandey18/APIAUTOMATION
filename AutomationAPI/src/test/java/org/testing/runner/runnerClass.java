package org.testing.runner;

import java.io.IOException;

import org.testing.testScripts.PutRequestTestCase;
import org.testing.testScripts.deleteRequestTestCase;
import org.testing.testScripts.getRequestTC;
import org.testing.testScripts.getRequestUsingQueryParams;
import org.testing.testScripts.patchRequestTestCase;
import org.testing.testScripts.postRequestTestCase;

public class runnerClass {
	
	
	
	
	public static void main(String args[]) throws IOException {
		
		postRequestTestCase post= new postRequestTestCase();
		System.out.print("Post is executing");
		post.postRequestTC();
		
		
		getRequestTC get= new getRequestTC();
		System.out.print("Get is executing");
		get.TestCaseGet();
		
		getRequestUsingQueryParams getQueryParam= new getRequestUsingQueryParams();
		System.out.print("Get with query params is executing");
		getQueryParam.TestCaseGetQueryParams();
		
		
		PutRequestTestCase put= new PutRequestTestCase();
		System.out.print("Put is executing");
		put.putRequest();
		
		patchRequestTestCase patch = new patchRequestTestCase();
		System.out.print("Patch is executing");
		patch.patchRequest();
		
		
		deleteRequestTestCase delete = new deleteRequestTestCase();
		System.out.print("Delete is executing");
		delete.deleteRequestTC();
		
	}

}
