package BasicAPITesting;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_Update_Record {
	
	@Test
	public void test1()
	{
	RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/update/71735";//endpoint& url for update
	RequestSpecification request = RestAssured.given();//for enter details in body part
	JSONObject requestParams = new JSONObject();
	requestParams.put("name", "Pramila L4");
	requestParams.put("salary", "855666");
	requestParams.put("age", "26");
	request.header("Content-Type", "application/json");//same as header in postman
	// Add the Json to the body of the request
	request.body(requestParams.toJSONString());
	// Post the request and check the response
	
	Response response = request.request(Method.PUT);
	
	System.out.println("Testing");
	int statusCode = response.getStatusCode();//status
			System.out.println(statusCode);
			System.out.println(response.asString());

	}
}