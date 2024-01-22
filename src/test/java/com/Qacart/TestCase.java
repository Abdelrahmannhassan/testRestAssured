package com.Qacart;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TestCase {

    @Test
    public void test(){

               given().baseUri("https://65ae55b31dfbae409a749555.mockapi.io/api/v1")
                .when().get("users")
                .then().log().all();
    }

}
