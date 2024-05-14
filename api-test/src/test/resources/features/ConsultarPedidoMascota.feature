Feature: Pedido de Mascotas

  @consultarPedido
  Scenario Outline: Consulta de Pedido de Mascota
    Given la url para consultar el pedido es "https://petstore.swagger.io/v2/store/order"
    When consulto el pedido de id <id>
    Then valido que el codigo de respuesta sea <codigoRespuesta>
    And valido el valor de  "petId" sea igual a "<petId>"
    And valido el valor de  "quantity" sea igual a "<quantity>"
    And valido el valor de  "shipDate" sea igual a "<shipDate>"
    And valido el valor de  "status" sea igual a "<status>"
    And valido el valor de  "complete" sea igual a "<complete>"
    Examples:
      | id   | petId | quantity | shipDate                     | status | complete | codigoRespuesta |
      | 1098 | 0     | 0        | 2024-05-14T19:18:55.775+0000 | placed | true     | 200             |