package Activities;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Activity1 {
	 String ROOT_URI="https://petstore.swagger.io/v2/pet";	
	
  @Test(priority=1)
  public void addNewPet() {
	String reqbody= "{"
			+"\"id\": 331864,"
			+ "\"name\": \"Riley\","
			+" \"status\":\"alive\""			
	+"}";
	
	Response response= 
	  given().contentType(ContentType.JSON)
	  .body(reqbody)
	  .when().post(ROOT_URI);
	
	//Assertions
	response.then().body("id", equalTo(331864));
    response.then().body("name", equalTo("Riley"));
    response.then().body("status", equalTo("alive"));
  
    String responseBody = response.getBody().asPrettyString();
    System.out.println("first test Response Body is =>  " + responseBody);
  }
 	  @Test(priority=2) 
 	  
 	 public void getPetInfo() { 
 		  
 	Response response =
	  given().contentType(ContentType.JSON) // Set headers
	  .when().pathParam("petId", "331864") // Set path parameter 
	  .get(ROOT_URI + "/{petId}"); // Send GET request
	  
	  // Assertion 
 	  response.then().body("id", equalTo(331864));
	  response.then().body("name", equalTo("Riley"));
	  response.then().body("status", equalTo("alive"));
	  
	  String responseBody = response.getBody().asPrettyString();
	  System.out.println(" 2nd test Response Body is =>  " + responseBody);
 	  }
	  
	  @Test(priority=3) 
	  private void delete() { 
		  
	  Response response =
	  given().contentType(ContentType.JSON) // Set headers
	  .when().pathParam("petId", "331864") // Set path parameter 
	  .delete(ROOT_URI + "/{petId}"); // Send DELETE request
	  
	  // Assertion 
	  response.then().body("code", equalTo(200));
	  response.then().body("message", equalTo("331864")); 
	  
	  String responseBody = response.getBody().asPrettyString();
	  System.out.println("3rd test Response Body is =>  " + responseBody);
	    }
	 
}
