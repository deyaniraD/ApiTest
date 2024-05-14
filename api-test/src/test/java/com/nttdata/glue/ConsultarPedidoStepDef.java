package com.nttdata.glue;

import com.nttdata.step.ConsultarPedidoStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ConsultarPedidoStepDef {

    @Steps
    private ConsultarPedidoStep consultar;

    @Given("la url para consultar el pedido es {string}")
    public void laUrlParaConsultarElPedidoEs(String url) {
        consultar.setURL(url);
    }

    @When("consulto el pedido de id {int}")
    public void consultoElPedidoDeIdId(int idPedido) {
        consultar.consultaPedido(idPedido);
    }

    @Then("valido que el codigo de respuesta sea {int}")
    public void validoQueElCodigoDeRespuestaSeaCodigoRespuesta(int cod) {
        consultar.validoElCodigoDeRespuestaSea(cod);

    }

    @And("valido el valor de  {string} sea igual a {string}")
    public void validoElValorDeSeaIgualA(String param, String val) {
        consultar.validoElValorDeSeaIgual(param,val);
    }
}
