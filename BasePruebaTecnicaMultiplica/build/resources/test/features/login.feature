#language: es
Característica:  Loguearse la pagina Gruyere
  Como usuario registrado
  Quiero loguearme en la página de Gruyere

  Esquema del escenario: Login exitoso
    Dado Que estoy en el home <Url>
    Cuando Ingreso las credenciales <User>, <Pwd>.
    Entonces Accedo exitosamente

    Ejemplos:
    |Url                                                                        |User    |Pwd    |
    |https://google-gruyere.appspot.com/622868589606524356799145020357742782228/|UserTes6|djkt123|
