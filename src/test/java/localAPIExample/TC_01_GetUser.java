package localAPIExample;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class TC_01_GetUser {
	
	@Test
	public void verifyUserTest() {
		
		System.out.println("=========executing api test==================");
		
		
		
		Response resp_api = get("http://localhost:3000/users");
		
		
		
		
		
		System.out.println("getContentType: " + resp_api.getContentType());
		System.out.println("getStatusCode: " + resp_api.getStatusCode());
		System.out.println("getTime: " + resp_api.getTime());
		System.out.println("getTime: " + resp_api.getHeader("X-Powered-By"));
		
//		given().
//		
//		
//		
//		when().
//		
//		
//		
//		then();
//		
		
	}

}
