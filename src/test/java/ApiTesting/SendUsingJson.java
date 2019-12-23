package ApiTesting;

import static io.restassured.RestAssured .*;

import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SendUsingJson {
public static void main(String[] args) {
	HashMap<String,String> map= new HashMap<String,String>();
	map.put("email", "eve.holt@reqres.in");
	map.put("password", "pistol");
	Response post = given().contentType(ContentType.JSON).body(map).post("https://reqres.in/api/register");
	post.prettyPrint();
}
}
