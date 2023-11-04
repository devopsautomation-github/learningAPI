package localAPIExampleStatic;

import static org.testng.Assert.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import utiltity.Constants;

public class TC_02_POST_CreateUserExample {
	
	@Test
	public void verifyUserTest() {
		
		
		baseURI = "http://localhost:3000";
		
		
		
		//request body/payload using lib
		
		
		JSONObject requestBody = new JSONObject();
		
		
		requestBody.put("last_name", "Abhinav");
		requestBody.put("first_name", "Abhinav SDET");
		requestBody.put("subjectId", 3);
		
		
		System.out.println("==================================");
		
		System.out.println(requestBody.toJSONString());
		
		
		System.out.println("==================================");
		
		
		
		given().
		
			//forming a request
			//paramter
			//header
		
			header("Content-Type", "application/json").
			
			//body
			
			body(requestBody.toJSONString()).
			//auth token
		
		
		
		when().
			
			//send a request to server ----- perfom an action

			post("/users").
		
		
		then()
		
			.statusCode(201)
			.log().all();
		
		
		
		
		
	}

}
