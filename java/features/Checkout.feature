#language: pt

Funcionalidade: validação preço total no checkout
  EU como cliente do site Swag Labs
  Quero selecionar dois produtos do site
  Para que consiga verificar no checkout o valor total deles

  @VPTC1 @AutoCheckout
  Esquema do Cenário: validar preco total dos produtos no carrinho com usuário standard
    Dado que acesso do site Swag Labs
    Quando seleciono dois produtos do site com o usuario <usuario> e senha <senha>
    E informo o primeiro nome <primeiroNome> ultimo nome <ultimoNome> e codigo postal <codigoPostal>
    Então sou capaz de verificar no checkout o valor total deles

    Exemplos:
      |usuario        |senha         |primeiroNome  |ultimoNome  |codigoPostal  |
      |"standard_user"|"secret_sauce"|"Carlos"      |"Silva"     |"04544-110"   |

  @VPTC2 @AutoCheckout
  Esquema do Cenário: validar preco total dos produtos no carrinho com usuário visual
    Dado que acesso do site Swag Labs
    Quando seleciono dois produtos do site com o usuario <usuario> e senha <senha>
    E informo o primeiro nome <primeiroNome> ultimo nome <ultimoNome> e codigo postal <codigoPostal>
    Então sou capaz de verificar no checkout o valor total deles

    Exemplos:
      |usuario        |senha         |primeiroNome  |ultimoNome  |codigoPostal  |
      |"visual_user" |"secret_sauce" |"Luiza"       |"Souza"     |"04544-110"   |