Feature: Buscar Destino

  @BuscarHotel
  Scenario Outline: Buscar hotel para nuestro destino
    Given ingreso a la aplicación Booking
    When dpy clic a buscador
    And escribo el "<destino>"
    And selecciono la fecha de estadia
    And selecciono la cantidad de personas
    And realizo la busqueda
    Then valido que se muestre las opciones de hospedaje

    Examples:
    | destino |
    | Cusco   |

  @ReservarHotel
  Scenario Outline: Reservar hotel para nuestro destino
    Given selecciono el segundo hospedaje
    When selecciono la habitación
    And selecciono el tipo de habitación
    And selecciono reservar
    And completo el formulario de datos con "<nombre>", "<apellido>", "<email>", "<direccion>", "<codPostal>", "<ciudad>", "<celular>"
    And selecciono el objetivo del viaje
    And selecciono proximo paso
    And selecciono el último paso
    And ingreso el numero de "<tarjeta>"
    And ingreso la fecha de "<expTarjeta>"
    And valido el costo de la reserva
    Then realizo la reserva

    Examples:
      | nombre |  apellido  | email               | direccion             | codPostal | ciudad  | celular   | tarjeta           | expTarjeta  |
      | Anali  |  Huiza     | avhuizad@gmail.com  | av 22 de agosto 1284  | 15091     | Comas   | 933764405 | 4051425436323363  | 02/25       |


