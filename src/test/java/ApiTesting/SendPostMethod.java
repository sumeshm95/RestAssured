package ApiTesting;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class SendPostMethod {
	// post request
	public static void main(String[] args) {
		Response post = given().auth().basic("sk_test_ZdKhX6c67x1n2T1S24Qy5Gqy00187S6zzD", "").
		formParam("name", "tyui").formParam("email", "parameterValues@gmail.com")
		.formParam("description", "parameterValues").log().all().post("https://api.stripe.com/v1/customers");
		
		post.prettyPrint();
	}
	

	/*
	 * public static void main(String[] args) { Response post =
	 * given().auth().basic("sk_test_ZdKhX6c67x1n2T1S24Qy5Gqy00187S6zzD", "").
	 * delete("https://api.stripe.com/v1/customers/cus_GLpPsQAjOX64nv");
	 * 
	 * post.prettyPrint(); }
	 */
	
}
