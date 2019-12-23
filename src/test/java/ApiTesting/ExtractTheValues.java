package ApiTesting;
import static io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ExtractTheValues {
	public static void main(String[] args) {
		 Response response =given().auth().basic("sk_test_ZdKhX6c67x1n2T1S24Qy5Gqy00187S6zzD", "").
				 formParam("name", "Killer").formParam("email", "killer@gmail.com").formParam("address[line1]", "chennai").
				 formParam("preferred_locales[0]" ,"yes")
					.post("https://api.stripe.com/v1/customers");
		// response.prettyPrint();
		 JsonPath jsonPath = response.jsonPath();
		
		/*
		 * Object object = jsonPath.get("id"); System.out.println(object);
		 * System.out.println(jsonPath.get("address"));
		 */
		 
		 
		 System.out.println(jsonPath.getMap("$").size());
		 System.out.println(jsonPath.getMap("address").size());
		 System.out.println(jsonPath.getList("preferred_locales").size());
		 
		
	}
	
	

}
