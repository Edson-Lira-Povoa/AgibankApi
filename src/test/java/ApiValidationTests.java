import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.qameta.allure.Allure;
import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import io.qameta.allure.restassured.AllureRestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@Epic("API Validation")
public class ApiValidationTests {

        @BeforeAll
        static void configurarAmbiente() {
                RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
                RestAssured.filters(new AllureRestAssured());
        }

        @Test
        @DisplayName("Validar listagem de usuários")
        @Step("Consultar todos os usuários")
        void validarListagemUsuarios() {

                given()
                                .when()
                                .get("/users")
                                .then()
                                .log().all()
                                .statusCode(200)
                                .body("$", not(empty()));
        }

        @Test
        @DisplayName("Validar busca por usuário específico")
        @Step("Consultar usuário por ID")
        void validarUsuarioPorId() {

                given()
                                .when()
                                .get("/users/1")
                                .then()
                                .log().all()
                                .statusCode(200)
                                .body("id", equalTo(1));
        }

        @Test
        @DisplayName("Validar usuário inexistente")
        @Step("Consultar usuário inválido")
        void validarUsuarioInexistente() {

                given()
                                .when()
                                .get("/users/9999")
                                .then()
                                .log().all()
                                .statusCode(404);
        }

        @Test
        @DisplayName("Validar criação de usuário")
        @Step("Criar novo usuário")
        void validarCriacaoUsuario() {

                given()
                                .contentType(ContentType.JSON)
                                .body("{\"name\":\"Edson\",\"job\":\"QA\"}")
                                .when()
                                .post("/users")
                                .then()
                                .log().all()
                                .statusCode(201);
        }
}