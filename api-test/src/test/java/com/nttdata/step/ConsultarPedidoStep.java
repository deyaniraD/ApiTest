package com.nttdata.step;

import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class ConsultarPedidoStep {

    private String URLBASE;

    public void setURL(String url) {
        this.URLBASE = url;
    }

    public void validoElCodigoDeRespuestaSea(int statusCode) {
        Assert.assertEquals(statusCode, lastResponse().getStatusCode());
    }

    public void consultaPedido(int idPedido) {
        SerenityRest.given()
                .baseUri(URLBASE)
                .contentType("application/json")
                .relaxedHTTPSValidation()
                .when()
                .log()
                .all()
                .get("/" + idPedido)
                .then()
                .log()
                .all()
        ;
    }

    public void validoElValorDeSeaIgual(String param, String val) {
        String resultadoReal = lastResponse().body().path(param).toString();
        Assert.assertEquals(val, resultadoReal);
    }
}
