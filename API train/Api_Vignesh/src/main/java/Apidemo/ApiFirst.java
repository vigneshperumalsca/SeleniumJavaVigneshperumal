package Apidemo;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class ApiFirst {
	@Test
	public void LaunchApi() {

Response response=RestAssured.get("https://app.reqres.in/getting-started");

System.out.println(response.getStatusCode());
	}

}
