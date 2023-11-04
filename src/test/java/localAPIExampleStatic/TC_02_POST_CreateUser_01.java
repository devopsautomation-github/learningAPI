package localAPIExampleStatic;




import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

//io.restassured.RestAssured.*
//io.restassured.matcher.RestAssuredMatchers.*
//org.hamcrest.Matchers.*


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC_02_POST_CreateUser_01 {
	
	
	
	@Test
	public void verifyListUserTest() {
		

		baseURI = "http://localhost:3000";
		
		
		String fname = "Aasha";
		String lname = "Soni";
		
		JSONObject request = new JSONObject();
		
		request.put("last_name", lname);
		request.put("first_name", fname);
		request.put("subjectId", 2);
		
		
//		{
//	        "last_name": "Giri",
//	        "first_name": "Utkarsh",
//	        "subjectId": 2
//	    }
		
		
		
		
		
		System.out.println("=====================================");
		
		System.out.println(request.toJSONString());
		
		System.out.println("=====================================");
		
		Response resp = given().
			//condition
			//header
			//body
			//auth token
			//parameter/queryParameter
			//contentType
		
			contentType(ContentType.JSON).
			header("Content-Type", "application/json").
		
			body(request.toJSONString()).
		

			
			
		
		when().
			//action
			//get/post/put/delete
			post("/users").
		
		
		
		then().
			//validation
		
			//StatusCode
			//Header
			//ContentType
			//Response --- JSON path
		
			statusCode(201).
			
			
//			header("Content-Type", "application/json; charset=utf-8").
//			header("X-Powered-By", "Express").
//			header("CF-Cache-Status", "DYNAMIC").
//			
			
			body("first_name", equalTo(fname)).
			
			
			log().all().extract().response();
		
		
		int resourceID = resp.path("id");
		
		
		System.out.println("resourceID" + resourceID);
		//=====================================================================
		
		
		given().
		//condition
		//header
		//body
		//auth token
		//parameter/queryParameter
		//contentType
	
		contentType(ContentType.JSON).
//		header("Content-Type", "application/json").
//	
//		body(request.toJSONString()).
	

		
		
	
	when().
		//action
		//get/post/put/delete
		get("/users"+ resourceID).
	
	
	
	then().
		//validation
	
		//StatusCode
		//Header
		//ContentType
		//Response --- JSON path
	
//		statusCode(200).
		
		
//		header("Content-Type", "application/json; charset=utf-8").
//		header("X-Powered-By", "Express").
//		header("CF-Cache-Status", "DYNAMIC").
//		
		
		body("first_name", equalTo(fname)).
		
		
		log().all();
		
		
		
	}

}
