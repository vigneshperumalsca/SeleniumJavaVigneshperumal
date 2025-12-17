package Apidemo;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class ApiFirst {
	@Test
	public void LaunchApi() {

Response response=RestAssured.get("https://app.reqres.in/getting-started");

System.out.println(response.getStatusCode());


//Sample OAuth Token Generation
Response response = given()
 .contentType("application/x-www-form-urlencoded")
 .formParam("grant_type", "client_credentials")
 .formParam("client_id", "client_id")
 .formParam("client_secret", "client_secret")
 .post("/oauth/token");

String token = response.jsonPath().getString("access_token");
//Sample API Test Case
given()
 .header("Authorization", "Bearer " + token)
 .when()
 .get("/v1/accounts")
 .then()
 .statusCode(200)
 .time(lessThan(2000L));





/*Sample Maven Dependencies
<dependency>
  <groupId>io.rest-assured</groupId>
  <artifactId>rest-assured</artifactId>
  <version>5.4.0</version>
</dependency>
<dependency>
  <groupId>org.testng</groupId>
  <artifactId>testng</artifactId>
  <version>7.9.0</version>
</dependency>*/


	}

}
