Feature: Registrarse en la pagina Gruyere
    Como usuario nuevo
    Quiero tener una cuenta en Gruyere

  Scenario Outline: Registro Exitoso
    Given Que estoy en el home <Url>
    When Diligencio el formualrio con las credenciales <User>, <Pwd>.
    Then Accedo exitosamente
    Examples:
      |Url                                                                        |User    |Pwd    |
      |https://google-gruyere.appspot.com/622868589606524356799145020357742782228/|UserTes9|djkt123|