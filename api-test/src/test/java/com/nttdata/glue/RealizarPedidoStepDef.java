package com.nttdata.glue;

import com.nttdata.step.RealizarPedidoMasStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RealizarPedidoStepDef {

    @Steps
    private RealizarPedidoMasStep realizarpedido;

    @Given("la url para realizar el pedido es {string}")
    public void laUrlParaRealizarElPedidoEs(String url) {
        realizarpedido.setURL(url);
    }

    @When("creo el pedido con id {int}, petId {int}, quantity {int}, shipDate {string}, status {string}")
    public void creoElPedidoConIdPetIdQuantityShipDateStatusComplete(int id, int petId, int quantity, String shipDate, String status) {
        realizarpedido.creoElPedidoConIdPetIdQuantityShipDateStatusComplete(id,petId,quantity,shipDate,status);
    }

    @Then("valido que el código de respuesta sea {int}")
    public void validoQueElCódigoDeRespuestaSeaCodResponse(int cod) {
        realizarpedido.validoElCodigoDeRespuestaSea(cod);
    }
}
