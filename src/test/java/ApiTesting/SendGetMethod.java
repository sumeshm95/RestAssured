package ApiTesting;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;


public class SendGetMethod {
	
	/*
	 * set authentication-basic auth/bear token
	 * Request-->set of request specification using given()
	 * Response-->validation
	 * content type-->
	 * using contentType()
	 * adding the content type in the headers
	 * 
	 * 
	 */
/*  Getting all  the data with limit and giving auth
	public static void main(String[] args) {
		 Response response =given().params("limit", 1).auth().basic("sk_test_ZdKhX6c67x1n2T1S24Qy5Gqy00187S6zzD", "")
		.get("https://api.stripe.com/v1/customers");
		
		//response.prettyPrint();
		 String Jason = response.asString();
		 System.out.println(Jason);
		 System.out.println(response.statusCode());
		 
		
		

	}
*/
	//getting the particular data with header
	public static void main(String[] args) {
		Response response = given().header("Authorization", "Bearer sk_test_ZdKhX6c67x1n2T1S24Qy5Gqy00187S6zzD").
		get("https://api.stripe.com/v1/customers/cus_GLTolWREN51xaN");
		response.prettyPrint();
		
	}
	
	
}
