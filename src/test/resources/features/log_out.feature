#language: es
Característica:  Cerrar Sesion de la pagina Gruyere
  Como usuario logueado
  Quiero cerrar sesión en la página de Gruyere

  Esquema del escenario: Sign Uot exitoso
    Dado Que estoy en el home <Url>
    Cuando Ingreso las credenciales <User>, <Pwd>.
    Entonces Cierro sesion exitosamente

    Ejemplos:
      |Url                                                                        |User    |Pwd    |
      |https://google-gruyere.appspot.com/622868589606524356799145020357742782228/|UserTes6|djkt123|
