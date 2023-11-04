package weatherAPI;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import utiltity.Constants;

public class TC_01_GetWeatherInfo {
	
	@Test
	public void verifyUserTest() {
		
		
		baseURI = "https://api.openweathermap.org";
		
		
		
		
		given().
		
			//forming a request
			//paramter
		
			param("q", "delhi").
			param("appid", Constants.token).
			//param("appid", "c76e6d1f2e6af75573c66176b1ad5627").
			
			//header
			//body
			//auth token
		
		
		
		when().
			
			//send a request to server ----- perfom an action
//			get(Constants.localAPI+ Constants.endPoint_listUser).
			get("/data/2.5/weather").
		
		
		then()
		
			.statusCode(200).log().all();
		
		
		
		
		
	}

}
