package ApiTesting;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PassJsonUsingPojo {
public static void main(String[] args) {
	PojoUser pj= new PojoUser("eve.holt@reqres.in", "pistol","78a","chennai","India");
	Response post = given().contentType(ContentType.JSON).body(pj).post("https://reqres.in/api/register");
	post.prettyPrint();
}
}
