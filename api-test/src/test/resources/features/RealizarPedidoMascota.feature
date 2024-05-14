Feature: Pedido de Mascotas

  @PedidoMascota
  Scenario Outline: Realizar pedido de mascota

    Given la url para realizar el pedido es "https://petstore.swagger.io/v2/store/order"
    When creo el pedido con id <id>, petId <petId>, quantity <quantity>, shipDate "<shipDate>", status "<status>"
    Then valido que el código de respuesta sea <codResponse>
    Examples:
      | id   | petId | quantity | shipDate                 | status | codResponse |
      | 1098 | 0     | 0        | 2024-05-14T19:18:55.775Z | placed | 200         |