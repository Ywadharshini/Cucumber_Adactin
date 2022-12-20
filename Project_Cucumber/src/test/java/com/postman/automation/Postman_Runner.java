package com.postman.automation;

import java.io.IOException;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;
import com.utilityfiles.Utility_Files;

public class Postman_Runner extends Utility_Files {

	@Test
	public void response_Body() {

		String resquestBody = response("https://reqres.in/", "/api/unknown");
		System.out.println("REQUEST BODY : ");
		System.out.println(resquestBody);

		String statusLine = StatusLine("https://reqres.in/", "/api/unknown");
		System.out.println("STATUS LINE : " + statusLine);

		int statusCode = statusCode("https://reqres.in/", "/api/unknown", 200);
		System.out.println("STATUS CODE : " + statusCode);
		System.out.println("Actual and Expected code are Validated");

		String session_Id = session_Id("https://reqres.in/", "/api/unknown");
		System.out.println("SESSION ID : " + session_Id);

		String contentType = contentType("https://reqres.in/", "/api/unknown");
		System.out.println("CONTENT TYPE: " + contentType);
	}

	@Test
	public void validate() throws IOException, ParseException {

		String payload = payload(
				"C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Project_Cucumber\\src\\test\\java\\com\\postman\\jsonfiles\\Payload.json",
				"name");

		System.out.println(payload);

		Assert.assertEquals("cerulean", payload);

		System.out.println("Actual and Expected value are Validated");

	}

}
