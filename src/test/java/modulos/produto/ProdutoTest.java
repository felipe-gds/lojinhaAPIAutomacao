package modulos.produto;

import DataFactory.ProdutoDataFactory;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pojo.UsuarioPojo;

// Static ajuda a deixar o texto dos parametros menores;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;
@DisplayName("Testes de API Rest do módulo de Produto")
public class ProdutoTest {
    private String token;
    @BeforeEach // Assim, sempre terá esses atributos antes dos testes, entregando o Token nas requisições.
    public void beforeEach() {

        // Configurando os dados da API Rest da Lojinha
        baseURI = "http://165.227.93.41";
        //port = 8080;
        basePath = "/lojinha";

        // Aqui iremos montar um Json do body com a Class UsuarioPojo
        // Lembrando que é preciso da biblioteca Jackson
        UsuarioPojo usuario = new UsuarioPojo("admin", "admin");

        // Obter o Token do usuário Admin
        this.token = given()
                .contentType(ContentType.JSON)
                .body(usuario)
            .when()
                .post("/v2/login")
            .then()
                .extract()
                    .path("data.token");
    }
    @Test
    @DisplayName("Validar que o valor do produto igual a 0.00 nao e permitido")
    public void testValidarLimitesProibidosValorProduto(){

            given()
                   .contentType(ContentType.JSON)
                   .header("token", this.token)
                   .body(ProdutoDataFactory.criarProdutoComValorIgualA(0.00))

            .when()
                   .post("/v2/produtos")
            .then()
                    .assertThat()
                       .body("error", equalTo("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00"))
                    .statusCode(422);
    }

    @Test
    @DisplayName("Validar que o valor do produto igual a 7000.01 nao e permitido")
    public void testValidarLimiteMaiorSeteMilProibidoValorProduto(){

        given()
                .contentType(ContentType.JSON)
                .header("token", this.token)
                .body(ProdutoDataFactory.criarProdutoComValorIgualA(7000.01))

            .when()
                .post("/v2/produtos")
            .then()
                .assertThat()
                    .body("error", equalTo("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00"))
                .statusCode(422);
    }
}
