package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class MobileBankApiTest {
    @Test
    public void shouldReturnDemoAccounts() {
// Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
// Выполняемые действия
                .when()
                .post("/post")
// Проверки

                .then()
                .statusCode(200)
                .body("data", equalTo("some"))
                .body("headers.content-length", equalTo("9"));
        ;
    }
}