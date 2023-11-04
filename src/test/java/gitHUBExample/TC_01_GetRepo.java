package gitHUBExample;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import utiltity.Constants;

public class TC_01_GetRepo {
	
	@Test
	public void verifyUserTest() {
		
		
		baseURI = "https://api.github.com";
		
		
		
		
		given().
		
			//forming a request
			//paramter
			//header
			//body
			//auth token
		
		
		
		when().
			
			//send a request to server ----- perfom an action
//			get(Constants.localAPI+ Constants.endPoint_listUser).
			get("/repositories").
		
		
		then()
		
			.statusCode(200).log().all();
		
		
		
		
		
	}

}
