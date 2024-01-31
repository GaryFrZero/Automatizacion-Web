Feature: Compra en Juntoz

  @Juntoz
  Scenario: Comprar un producto con envio gratis
    Given dado que estoy en la pagina Juntoz
    When hago clic en el enlace Cuenta
    And luego doy clic en el boton Iniciar Sesion
    And inicio sesion con las credenciales usuario "garyesp@hotmail.com" y contraseña "blueshop2"
    Then valido que la autenticacion sea exitosa
    When ingreso a la categoria "Envio Gratis"
    And selecciono el primer producto disponible
    And agrego el producto al carrito
    Then valido que el producto se haya agregado exitosamente al carrito



