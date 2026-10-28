package br.com.caixa.usuario;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

@QuarkusTest
class UsuarioResourceTest {

    @Test
    void listaUsuariosCarregadosNoBanco() {
        given()
                .when()
                .get("/usuarios")
                .then()
                .statusCode(200)
                .body("$", hasSize(3))
                .body("[0].nome", equalTo("Ana Souza"))
                .body("[0].email", equalTo("ana.souza@caixa.gov.br"))
                .body("[1].nome", equalTo("Bruno Lima"))
                .body("[2].nome", equalTo("Carla Dias"));
    }
}
