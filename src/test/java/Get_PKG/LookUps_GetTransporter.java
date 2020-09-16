package Get_PKG;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class LookUps_GetTransporter {

	
	@Test
	void Get_Data()
	{
		Response response = get("https://trip.gw.safav2.io.safavisa.com/transporters");
		
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
			given().get("https://trip.gw.safav2.io.safavisa.com/transporters").then()
			.statusCode(200).body("data.name" , equalTo("en_EG Transporter 1, en_EG Transporter 2"));
			
		}
		
		catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
}
