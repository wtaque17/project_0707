Feature: Busqueda en google
  Yo como usuario que ingresa a google
  quiero buscar la palabra animal
  para ver las opciones de busqueda

  Scenario: validar busqueda exitosa
    Given El usuario ingresa a Google
    When Realiza la busqueda de la palabra animal
    Then Se muestran resultados con la palabra animal