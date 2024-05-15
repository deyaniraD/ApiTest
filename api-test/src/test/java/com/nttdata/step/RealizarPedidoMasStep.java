package com.nttdata.step;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class RealizarPedidoMasStep {

    private String URLBASE;

    public void setURL(String url) {
        this.URLBASE = url;
    }

    public void validoElCodigoDeRespuestaSea(int statusCode) {
        Assert.assertEquals(statusCode, lastResponse().getStatusCode());
    }

    public void creoElPedidoConIdPetIdQuantityShipDateStatusComplete(String id, String petId, String quantity, String shipDate, String status) {
        SerenityRest.given()
                .contentType("application/json")
                .relaxedHTTPSValidation()
                .body("{\n" +
                        "  \"id\": " + id + ",\n" +
                        "  \"petId\": " + petId + ",\n" +
                        "  \"quantity\": " + quantity + ",\n" +
                        "  \"shipDate\": \"" + shipDate + "\",\n" +
                        "  \"status\": \"" + status + "\",\n" +
                        "  \"complete\": true\n" +
                        "}")
                .post(URLBASE)
                .then()
                .log()
                .all();
    }
}
