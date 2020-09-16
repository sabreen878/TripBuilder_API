package Get_PKG;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class LookUps_GetCommonProductBuilder {

	
	@Test
	void Get_Data()
	{
		Response response = get("https://trip.gw.safav2.io.safavisa.com/lookups_common_product_builder");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		System.out.println(response.getBody());
		System.out.println(response.getTime());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		



	}
	
	
	@Test
	public void assertion()
	{
		
			given().get("https://trip.gw.safav2.io.safavisa.com/lookups_common_product_builder").then()
			.body("data.product_types.name" , equalTo("hajj, umrah, tourism, other"));
	}
	
	@Test
	public void Classifications()
	{
		
			given().get("https://trip.gw.safav2.io.safavisa.com/lookups_common_product_builder").then()
			.body("data.product_classifications.name" , equalTo("1 star, 2 star, 3 star, 4 star, 5 star, 6 star, 7 star"));
	}
	
	@Test
	public void ProduvtPrice()
	{
		
			given().get("https://trip.gw.safav2.io.safavisa.com/lookups_common_product_builder").then()
			.body("data.product_price_types.name" , equalTo("break down package, full package"));
	}
	
	@Test
	public void Hotels()
	{
		
			given().get("https://trip.gw.safav2.io.safavisa.com/lookups_common_product_builder").then()
			.body("data.hotel_types.name" , equalTo("local, inventory"));
	}
	
	@Test
	public void RoomType()
	{
		
			given().get("https://trip.gw.safav2.io.safavisa.com/lookups_common_product_builder").then()
			.body("data.room_types.name" , equalTo("1X, 2X, 3X, 4X, 5X, 6X, 7X, suite, flat rate"));
	}
	
	@Test
	public void MealTypes()
	{
		
			given().get("https://trip.gw.safav2.io.safavisa.com/lookups_common_product_builder").then()
			.body("data.meal_types.name" , equalTo("breakfast, lunch, dinner"));
	}
	
	@Test
	public void DestinationType()
	{
		
			given().get("https://trip.gw.safav2.io.safavisa.com/lookups_common_product_builder").then()
			.body("data.destination_types.name" , equalTo("departure, return"));
	}
	
	@Test
	public void TransportationType()
	{
		
			given().get("https://trip.gw.safav2.io.safavisa.com/lookups_common_product_builder").then()
			.body("data.transportation_types.name" , equalTo("air, land, maritime"));
	}
	
	@Test
	public void TransportationCycleType()
	{
		
			given().get("https://trip.gw.safav2.io.safavisa.com/lookups_common_product_builder").then()
			.body("data.transportation_cycle_types.name" , equalTo("part cycle, full cycle"));
	}
	
	
	@Test
	public void VisaOption()
	{
		
			given().get("https://trip.gw.safav2.io.safavisa.com/lookups_common_product_builder").then()
			.body("data.visa_options.name" , equalTo("limited, unlimited"));
	}
	
	@Test
	public void DiscountType()
	{
		
			given().get("https://trip.gw.safav2.io.safavisa.com/lookups_common_product_builder").then()
			.body("data.discount_types.name" , equalTo("percentage, fixed number"));
	}
}
