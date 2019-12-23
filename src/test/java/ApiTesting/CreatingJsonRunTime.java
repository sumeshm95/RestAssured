package ApiTesting;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreatingJsonRunTime {
	public static void main(String[] args) throws JSONException  {
		JSONObject jo= new JSONObject();
		jo.put("email", "sumeshm00t@gmail.com");
		jo.put("filename", "sumesh");
		jo.put("lastname", "tyu");
		JSONArray mobiles= new JSONArray();
		mobiles.put(123456);
		mobiles.put(8956);
		jo.put("mobile number", mobiles);
		JSONObject joa= new JSONObject();
		joa.put("flatnumber", "78a");
		joa.put("city", "chennai");
		joa.put("country", "India");
		jo.put("address", "joa");
		
		
		Response post = given().contentType(ContentType.JSON).body(jo).post("https://reqres.in/api/register");
		post.prettyPrint();
	}

}
