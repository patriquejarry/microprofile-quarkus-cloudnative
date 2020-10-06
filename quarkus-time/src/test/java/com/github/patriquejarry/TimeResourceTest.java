package com.github.patriquejarry;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.startsWith;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class TimeResourceTest {

	@Test
	public void testTimeEndpoint() {
		given().when().get("/time").then().statusCode(200).body(startsWith("time"));
	}

}