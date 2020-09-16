package Get_PKG;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class LookUps_GetSightseeings {
	
	@Test
	void Get_Data()
	{
		Response response = get("https://trip.gw.safav2.io.safavisa.com/sightseeings");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		System.out.println(response.getBody());
		System.out.println(response.getTime());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);

	}
	
	
	
	@Test(dependsOnMethods = {"Get_Data"})
	public void assertion()
	{
		
		try {
			given().get("https://trip.gw.safav2.io.safavisa.com/sightseeings").then()
			.statusCode(200).body("data.name" , equalTo("Sightseeing 1, Sightseeing 2"));
			
		}
		
		catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}

}
