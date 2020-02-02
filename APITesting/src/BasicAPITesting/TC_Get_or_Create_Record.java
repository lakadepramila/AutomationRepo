package BasicAPITesting;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_Get_or_Create_Record {

	@Test
	public void test1()
	{
	RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/create";//endpoint& url
	RequestSpecification request = RestAssured.given();//for enter details in body part
	JSONObject requestParams = new JSONObject();
	requestParams.put("name", "Pramila L3");
	requestParams.put("salary", "855666");
	requestParams.put("age", "26");
	request.header("Content-Type", "application/json");//same as header in postman
	// Add the Json to the body of the request
	request.body(requestParams.toJSONString());
	// Post the request and check the response
	
	Response response = request.request(Method.POST);
	
	System.out.println("Testing");
	int statusCode = response.getStatusCode();//status
			System.out.println(statusCode);
			System.out.println(response.asString());

			JsonPath jsonPathEvaluator = response.jsonPath();//use after autocreated id
			String id = jsonPathEvaluator.get("id");
			System.out.println(id);
	}
}
