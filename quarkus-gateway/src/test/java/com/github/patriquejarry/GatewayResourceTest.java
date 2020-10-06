package com.github.patriquejarry;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.startsWith;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class GatewayResourceTest {

	@Test
	public void testHelloEndpoint() {
		given().when().get("/gateway").then().statusCode(200).body(startsWith("gateway"));
	}

}