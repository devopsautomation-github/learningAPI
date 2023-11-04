package localAPIExample;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import utiltity.Constants;

public class TC_01_GetUser_Static {
	
	@Test
	public void verifyUserTest() {
		
		
		baseURI = "http://localhost:3000";
		
		
		
		
		given().
		
			//forming a request
			//paramter
			//header
			//body
			//auth token
		
		
		
		when().
			
			//send a request to server ----- perfom an action
//			get(Constants.localAPI+ Constants.endPoint_listUser).
			get("/users/96").
		
		
		then()
		
			.statusCode(200).log().all();
		
		
		
		
		
	}

}
