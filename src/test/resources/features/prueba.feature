#Autor: David Morales Valencia
  #language:es

@HistoriaDeUsuario
Característica: Verificar el ingreso correcto al app XTTT
  Yo como usuario quiero ingresar a la XTTT para verificar que tengo acceso a ella

  @CasoLogueo
  Esquema del escenario: Verificar ingreso correcto
    Dado que Andres ingresa a la app XTTT
    Cuando digita sus credenciales e ingresa a la app
      | <usuario> | <contrasenia> |
    Entonces  verifica que pudo ingresar correctamente
    Ejemplos:
      | usuario     | contrasenia  |
      | @Andrus2022 | ***andrus*** |