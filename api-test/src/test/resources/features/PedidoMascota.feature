@masivo
Feature: Pedido Mascota
  Realizamos un pedido de mascota y luego consultamos el pedido que registramos.

  @escenario1
  Scenario Outline: Realizar pedido de mascota

    Given la url para realizar el pedido es "https://petstore.swagger.io/v2/store/order"
    When creo el pedido con id <id>, petId <petId>, quantity <quantity>, shipDate "<shipDate>", status "<status>"
    Then valido que el código de respuesta sea <codResponse>
    Examples:
      | id   | petId | quantity | shipDate                 | status | codResponse |
      | 1098 | 0     | 0        | 2024-05-14T19:18:55.775Z | placed | 200         |


  @escenario2
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