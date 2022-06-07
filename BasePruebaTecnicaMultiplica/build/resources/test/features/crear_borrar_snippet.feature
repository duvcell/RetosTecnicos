Feature: Crear y Borrar Snippet en la pagina Gruyere
  Como usuario nuevo
  Quiero Crear y Borrar Snippet en Gruyere

  Scenario Outline: Crear y Borrar Snippet
    Given Que estoy en el home <Url>
    When Ingreso las credenciales <User>, <Pwd>.
    And Diligencio el formulario de crear Snippets <Texto>
    And Borro el ultimo Snippet creado
    Then Valido que se haya borrado exitosamente


    Examples:
      |Url                                                                        |User    |Pwd    |Texto|
      |https://google-gruyere.appspot.com/622868589606524356799145020357742782228/|UserTes6|djkt123|Mi ultimo Snippet777777777777|