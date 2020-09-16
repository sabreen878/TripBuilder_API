package Get_PKG;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Products_ListProducts {

	@Test
	void Get_Data()
	{
		Response response = get("https://trip.gw.safav2.io.safavisa.com/products");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
	
	
	
	@Test
	void Get_DataId()
	{
		given().get("https://trip.gw.safav2.io.safavisa.com/products").then().statusCode(200)
		.body("data.id", equalTo(null));

	}
	
	
	@Test
	void Get_DataName()
	{	
		given().get("https://trip.gw.safav2.io.safavisa.com/products").then().statusCode(200)
		.body("data.name", equalTo(null));

	}
	
	@Test
	void Get_DataClassificationName()
	{
		given().get("https://trip.gw.safav2.io.safavisa.com/products").then().statusCode(200)
		.body("data.product_classification.name", equalTo(null));
		
	}
	
	@Test
	void Get_DataProductItems()
	{
		given().get("https://trip.gw.safav2.io.safavisa.com/products").then().statusCode(200)
		.body("data.product_items.id", equalTo(null));
		
	}
}
