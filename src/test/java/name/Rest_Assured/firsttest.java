package name.Rest_Assured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class firsttest {
	@Test
	public void sample() {
		RestAssured.baseURI="http://demo.guru99.com";

		given().when().get("/V4/sinkministatement.php").then().log().all().assertThat().statusCode(200);
}
public void testcase()
{}
}
